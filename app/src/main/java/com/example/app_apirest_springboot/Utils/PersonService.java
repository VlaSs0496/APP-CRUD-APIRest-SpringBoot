package com.example.app_apirest_springboot.Utils;

import retrofit2.Call;
import retrofit2.http.GET;

import com.example.app_apirest_springboot.Model.Person;

import java.util.List;

public interface PersonService {

    @GET("listar/")
    Call<List<Person>>getPerson();
}
