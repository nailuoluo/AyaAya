package com.momiji.kotlin.ayaaya.module.exception

import com.momiji.kotlin.ayaaya.model.exception.ErrorModel
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import retrofit2.HttpException

/**
 * Created by Momiji on 2017/9/10.
 */
object ExceptionModule {

    private lateinit var mErrorModel: ErrorModel

    fun handle(throwable: Throwable): String {
        when (throwable) {
            is HttpException -> {
                val errJson: String = throwable.response().errorBody().toString()
                val moshi = Moshi.Builder().build()
                val jsonAdapter = moshi.adapter(ErrorModel::class.java)
                try {
                    mErrorModel = jsonAdapter.fromJson(errJson)!!
                    return mErrorModel.error
                } catch (e:JsonDataException) {
                    return errJson
                }
            }
            else -> return throwable.message!!
        }
    }
}