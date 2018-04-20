package com.example.yodgorbekkomilov.footballlovers.Pojo;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/scores/live.json?key=V2WgfDFBczaVCnaf&secret=MUDUKyAQhr4rmk6in2yDGefTNpPpNZFz")
    Call<ResponseMatch> getLiveScore();


}
