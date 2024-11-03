package com.example.quote_random.retrofitclient;
import com.example.quote_random.apiservise.ApiServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static final String Base_URL="https://dummyjson.com/";
    public static ApiServices apiServices=null;

    public static ApiServices getInstence(){
        if (apiServices ==null){
            apiServices=new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiServices.class);
        }
        return apiServices;
    }


}
