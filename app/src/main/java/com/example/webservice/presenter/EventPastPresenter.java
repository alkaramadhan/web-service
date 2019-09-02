package com.example.webservice.presenter;

import android.util.Log;

import com.example.webservice.api.ApiClient;
import com.example.webservice.model.EventPastResponse;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventPastPresenter {
     private EventPastContract eventPastContract;

    public EventPastPresenter(EventPastContract eventPastContract){
        this.eventPastContract = eventPastContract;
    }



    public void index() {
        Call<EventPastResponse>eventPastResponseCall = new ApiClient().apiService.events();
        eventPastResponseCall.enqueue(new Callback<EventPastResponse>() {
            @Override
            public void onResponse(Call<EventPastResponse> call, Response<EventPastResponse> response) {
                eventPastContract.listMatch(response.body().getEvents());
            }

            @Override
            public void onFailure(Call<EventPastResponse> call, Throwable t) {
                Log.d("ListMatch","GAGAL");

            }
        });


    }
}
