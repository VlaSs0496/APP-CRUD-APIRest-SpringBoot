package com.example.app_apirest_springboot.Utils;

import retrofit2.Retrofit;

public class Cliente {

    public static Retrofit getCliente(String url){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
