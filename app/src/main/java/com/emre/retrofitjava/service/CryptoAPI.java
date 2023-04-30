package com.emre.retrofitjava.service;

import com.emre.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    // https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    //GET
    //URL BASE -> www.website.com
    //GET -> /price?key=xxx

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    //Call<List<CryptoModel>> getData(); //Liste içerisinde CryptoModel'leri getirecek // API liste şeklinde getirdiği için List yapıyoruz
    Observable<List<CryptoModel>> getData(); //Gözlemlenebilir obje
}
