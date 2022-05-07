package com.realinet.fanpagemanager;;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://fanpage-manager-pro.herokuapp.com";

    /**
     * The return type is important here
     * The class structure that you've defined in Call<T>
     * should exactly match with your json response
     * If you are not using another api, and using the same as mine
     * then no need to worry, but if you have your own API, make sure
     * you change the return type appropriately
     **/
    @GET("/")
    Call<Response> getTopTwentyTrendingKeywordGoogle(@Query("countryCode") String countryCode);
    @FormUrlEncoded
    @POST("/addAccount")
    Call<String> addNewAccount(@Field("cookies") String cookies, @Field("userAgent") String userAgent);
}
