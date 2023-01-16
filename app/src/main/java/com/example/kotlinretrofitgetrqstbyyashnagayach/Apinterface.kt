package com.example.kotlinretrofitgetrqstbyyashnagayach


import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET( "posts")
    //@GET("Insert end point")

    fun getData(): Call<List<MyDataItem>>

    //List is the data type.
///<Insert type>
}