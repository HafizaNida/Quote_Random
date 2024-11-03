package com.example.quote_random.apiservise;

import com.example.quote_random.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {
    @GET("quotes/random")
    Call<Data>getQuotes();


}
