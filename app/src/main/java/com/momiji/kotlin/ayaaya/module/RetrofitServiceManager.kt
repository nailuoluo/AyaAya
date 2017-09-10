package com.momiji.kotlin.ayaaya.module

import android.content.Context
import com.momiji.kotlin.ayaaya.module.oauth.login.LoginLocalInfo
import com.momiji.kotlin.ayaaya.utl.DEFAULT_TIME_OUT
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Momiji on 2017/9/10.
 */
object RetrofitServiceManager {

    lateinit var mRetrofit: Retrofit

    fun init(context: Context) {
        val login = LoginLocalInfo(context)

        var builder: OkHttpClient.Builder = OkHttpClient.Builder()
        builder.connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
        builder.readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)


        var commonInterceptor: HttpCommonInterceptor = HttpCommonInterceptor.Builder()
                .addHeaderParams("Authorization", "OAuth2 " + login.mAccessToken)
                .build()
        builder.addInterceptor(commonInterceptor)

        mRetrofit = Retrofit.Builder().client(builder.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(SINA_BASE_URL)
                .build()
    }


    fun <T> create(service: Class<T>): T {
        return mRetrofit.create(service)
    }

}