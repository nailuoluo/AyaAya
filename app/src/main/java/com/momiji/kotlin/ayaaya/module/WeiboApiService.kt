package com.momiji.kotlin.ayaaya.module

import com.momiji.kotlin.ayaaya.model.oauth.UidModel
import com.momiji.kotlin.ayaaya.model.statuses.UserTimelineModel
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by Momiji on 2017/9/8.
 */
interface WeiboApiService {

    @GET(GET_UID)
    fun getUid(): Observable<UidModel>

    @GET(USER_TIMELINE)
    fun getUserTimeline(@Query("uid") uid: Long): Observable<UserTimelineModel>
}