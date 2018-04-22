package com.example.abbos.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;


public interface ApiInterface {

    @POST("read.php")
    Call<List<Contact>> listRepos();

}