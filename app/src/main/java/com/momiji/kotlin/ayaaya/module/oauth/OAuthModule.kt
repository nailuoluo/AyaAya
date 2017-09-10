package com.momiji.kotlin.ayaaya.module.oauth

import android.content.Context
import com.momiji.kotlin.ayaaya.model.oauth.UidModel
import com.momiji.kotlin.ayaaya.module.BaseModule
import com.momiji.kotlin.ayaaya.module.RetrofitServiceManager
import com.momiji.kotlin.ayaaya.module.WeiboApiService
import io.reactivex.Observable

/**
 * Created by Momiji on 2017/9/10.
 */
class OAuthModule(context: Context): BaseModule(context) {

    private val mService: WeiboApiService
    init {
        RetrofitServiceManager.init(mContext)
        mService = RetrofitServiceManager.create(WeiboApiService::class.java)
    }

    fun getUid(): Observable<UidModel>  {
        return observe(mService.getUid())
    }
}