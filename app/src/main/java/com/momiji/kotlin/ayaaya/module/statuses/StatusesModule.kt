package com.momiji.kotlin.ayaaya.module.statuses

import android.content.Context
import com.momiji.kotlin.ayaaya.model.statuses.UserTimelineModel
import com.momiji.kotlin.ayaaya.module.BaseModule
import com.momiji.kotlin.ayaaya.module.RetrofitServiceManager
import com.momiji.kotlin.ayaaya.module.WeiboApiService
import io.reactivex.Observable

/**
 * Created by Momiji on 2017/9/11.
 */
class StatusesModule(context: Context): BaseModule(context) {

    private val mService: WeiboApiService
    init {
        RetrofitServiceManager.init(mContext)
        mService = RetrofitServiceManager.create(WeiboApiService::class.java)
    }

    fun getUserTimeline(uid: Long): Observable<UserTimelineModel> {
        return observe(mService.getUserTimeline(uid))
    }
}