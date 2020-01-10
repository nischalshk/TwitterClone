package com.aboveall.twitterclone.api;

import com.aboveall.twitterclone.model.Users;
import com.aboveall.twitterclone.serverresponse.ImageResponse;
import com.aboveall.twitterclone.serverresponse.RegisterResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UsersAPI {
    @POST("users/register")
    Call<RegisterResponse> registerUser(@Body Users users);

    @FormUrlEncoded
    @POST("users/login")
    Call<RegisterResponse> checkUser(@Field("email") String email, @Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part image);
//
//    @GET("users/me")
//    Call<Users> getUserDetails(@Header("Authorization")String token);
}
