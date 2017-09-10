package com.momiji.kotlin.ayaaya.module

/**
 * Created by Momiji on 2017/9/10.
 */

import java.io.IOException
import java.util.HashMap

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by Momiji on 2017/9/10.
 */
class HttpCommonInterceptor : Interceptor {

    private val mHeaderParamsMap = HashMap<String, String>()

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val oldRequest = chain.request()
        val requestBuilder = oldRequest.newBuilder()

        requestBuilder.method(oldRequest.method(),
                oldRequest.body())

        if (mHeaderParamsMap.size > 0) {
            for ((key, value) in mHeaderParamsMap) {
                requestBuilder.header(key, value)
            }
        }

        val newRequest = requestBuilder.build()
        return chain.proceed(newRequest)
    }

    class Builder {
        internal var mHttpCommonInterceptor: HttpCommonInterceptor

        init {
            mHttpCommonInterceptor = HttpCommonInterceptor()
        }

        fun addHeaderParams(key: String, value: String): Builder {
            mHttpCommonInterceptor.mHeaderParamsMap.put(key, value)
            return this
        }

        fun addHeaderParams(key: String, value: Int): Builder {
            return addHeaderParams(key, value.toString())
        }

        fun addHeaderParams(key: String, value: Float): Builder {
            return addHeaderParams(key, value.toString())
        }

        fun addHeaderParams(key: String, value: Long): Builder {
            return addHeaderParams(key, value.toString())
        }

        fun addHeaderParams(key: String, value: Double): Builder {
            return addHeaderParams(key, value.toString())
        }

        fun build(): HttpCommonInterceptor {
            return mHttpCommonInterceptor
        }
    }
}