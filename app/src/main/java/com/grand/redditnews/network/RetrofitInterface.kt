package com.grand.redditnews.network

import com.example.standardtask.data.models.received.MainSliderImagesModel
import com.example.standardtask.data.models.send.BodySent
import com.grand.redditnews.utilities.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitInterface {

    @POST(Constants.MAIN_SLIDERS_ENDPOINT)
    suspend fun getBannerImages(
        @Header("lang") lang: String,
        @Body bodySent: BodySent
    ): Response<MainSliderImagesModel>

}