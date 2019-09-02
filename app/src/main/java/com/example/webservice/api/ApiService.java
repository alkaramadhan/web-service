package com.example.webservice.api;

import com.example.webservice.model.EventPastResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/v1/json/1/eventspastleague.php?id=4328")
    Call<EventPastResponse> events();
}
