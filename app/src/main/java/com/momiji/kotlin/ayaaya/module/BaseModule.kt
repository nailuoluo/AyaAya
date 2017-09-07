package com.momiji.kotlin.ayaaya.module

import android.content.Context
import com.momiji.kotlin.ayaaya.ui.MyPreferences
import com.momiji.kotlin.ayaaya.utl.KEY_ACCESS_TOKEN

/**
 * Created by liuy314 on 2017/9/7.
 */

open class BaseModule(context: Context) {

    open protected var mContext: Context = context
    open protected var mAccessToken by MyPreferences(mContext, KEY_ACCESS_TOKEN, "")
    
}