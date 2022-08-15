package com.example.bmprojecttrial.api

import com.example.bmprojecttrial.dataclasses.RegisterResponse
import com.example.bmprojecttrial.dataclasses.User
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/register")
    fun register(@Body user: User): Call<RegisterResponse>


}

var service = Retrofit.
Builder().
baseUrl("https://reqres.in/").
addConverterFactory(GsonConverterFactory.create())
    .build().create(ApiService::class.java)