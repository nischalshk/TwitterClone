package com.aboveall.twitterclone.bll;


import com.aboveall.twitterclone.api.UsersApi;
import com.aboveall.twitterclone.serverresponse.SignUpResponse;
import com.aboveall.twitterclone.url.Url;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginBLL {

    boolean isSuccess = false;

    public boolean checkUser(String username, String password) {

        UsersApi usersApi = Url.getInstance().create(UsersApi.class);
        Call<SignUpResponse> usersCall = usersApi.checkUser(username, password);

        try {
            Response<SignUpResponse> loginResponse = usersCall.execute();
            if (loginResponse.isSuccessful() &&
                    loginResponse.body().getStatus().equals("Login success!")) {

                Url.token += loginResponse.body().getToken();
                // Url.Cookie = imageResponseResponse.headers().get("Set-Cookie");
                isSuccess = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
