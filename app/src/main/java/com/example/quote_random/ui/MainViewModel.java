package com.example.quote_random.ui;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.quote_random.model.Data;
import com.example.quote_random.retrofitclient.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainViewModel extends ViewModel {

    private final MutableLiveData<Data> _getQuotes=new MutableLiveData<>();
    public LiveData<Data> getQuotes=_getQuotes;

    public void fetchQuote(){
        RetrofitClient.getInstence().getQuotes().enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {


                if(response .isSuccessful() && response.body() !=null);
                _getQuotes.postValue(response.body());
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });
    }

}
