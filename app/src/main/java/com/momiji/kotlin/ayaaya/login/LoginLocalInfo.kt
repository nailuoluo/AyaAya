package com.momiji.kotlin.ayaaya.login

import android.content.Context
import com.momiji.kotlin.ayaaya.ui.MyPreferences
import com.momiji.kotlin.ayaaya.utl.Constants
import com.momiji.kotlin.ayaaya.utl.isTokenExpired

/**
 * Created by Momiji on 2017/9/5.
 */
class LoginLocalInfo(val mContext: Context) {

    var mAccessToken: String by MyPreferences(mContext, Constants.ACCESS_TOKEN, "")
    var mUid: String by MyPreferences(mContext, Constants.UID, "")
    var mExpireDate: Long by MyPreferences(mContext, Constants.EXPIRE_IN, 0L)

    fun needsLogin(): Boolean {
        return(mAccessToken.isEmpty() || isTokenExpired(mExpireDate))
    }

}