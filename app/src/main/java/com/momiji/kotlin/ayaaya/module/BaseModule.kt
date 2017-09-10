package com.momiji.kotlin.ayaaya.module

import android.content.Context
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by liuy314 on 2017/9/7.
 */

open class BaseModule(context: Context) {

    protected val mContext = context

    open protected fun <T> observe(observable: Observable<T>): Observable<T> {
        return observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
    }

    open protected fun <T> flow(flowable: Flowable<T>): Flowable<T> {
        return flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
    }
    
}