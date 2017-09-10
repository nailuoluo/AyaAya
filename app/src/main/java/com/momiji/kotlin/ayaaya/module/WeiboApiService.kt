package com.momiji.kotlin.ayaaya.module

import com.momiji.kotlin.ayaaya.model.oauth.UidModel
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * Created by Momiji on 2017/9/8.
 */
interface WeiboApiService {

    @GET("account/get_uid.json")
    fun getUid(): Observable<UidModel>


}