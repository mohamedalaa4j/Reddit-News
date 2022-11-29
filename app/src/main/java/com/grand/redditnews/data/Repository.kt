package com.grand.redditnews.data

import com.example.standardtask.data.models.send.BodySent
import com.grand.redditnews.network.RetrofitInterface
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Repository @Inject constructor(
    private val retrofitInterface: RetrofitInterface,
    private val ioDispatcher: CoroutineDispatcher
) {

    suspend fun getBannerImages(lang: String, body: BodySent) =
        withContext(ioDispatcher) { retrofitInterface.getBannerImages(lang, body) }

}