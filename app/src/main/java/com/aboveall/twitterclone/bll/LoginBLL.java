package com.aboveall.twitterclone.bll;

import com.aboveall.twitterclone.api.UsersAPI;
import com.aboveall.twitterclone.serverresponse.RegisterResponse;
import com.aboveall.twitterclone.url.Url;


import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginBLL {
    boolean isSuccess = false;

    public boolean checkUser(String username, String password) {

        UsersAPI usersAPI = Url.getInstance().create(UsersAPI.class);
        Call<RegisterResponse> usersCall = usersAPI.checkUser(username, password);

        try {
            Response<RegisterResponse> loginResponse = usersCall.execute();
            if (loginResponse.isSuccessful() &&
                    loginResponse.body().getStatus().equals("Login Successful")) {
                Url.token += loginResponse.body().getToken();
                isSuccess = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
