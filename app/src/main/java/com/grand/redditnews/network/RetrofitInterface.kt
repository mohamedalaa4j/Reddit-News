package com.grand.redditnews.network

import com.grand.redditnews.data.models.received.KotlinNewsModel
import com.grand.redditnews.utilities.KOTLIN_NEWS_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitInterface {

    @GET(KOTLIN_NEWS_ENDPOINT)
    suspend fun getKotlinNews(): Response<KotlinNewsModel>

}