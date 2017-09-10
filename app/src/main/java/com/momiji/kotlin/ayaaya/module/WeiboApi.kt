package com.momiji.kotlin.ayaaya.module

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Momiji on 2017/9/8.
 */
interface WeiboApi {

    @GET("account/get_uid.json")
    fun getUid(@Query("access_token") accessToken: String): Observable<String>

}