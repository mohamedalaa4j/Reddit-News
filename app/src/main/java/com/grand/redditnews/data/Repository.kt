package com.grand.redditnews.data

import com.grand.redditnews.network.RetrofitInterface
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Repository @Inject constructor(
    private val retrofitInterface: RetrofitInterface,
    private val ioDispatcher: CoroutineDispatcher
) {

    suspend fun getKotlinNews() = withContext(ioDispatcher) { retrofitInterface.getKotlinNews() }

}