package com.momiji.kotlin.ayaaya.module.login

import android.content.Context
import com.momiji.kotlin.ayaaya.ui.MyPreferences
import com.momiji.kotlin.ayaaya.utl.*

/**
 * Created by Momiji on 2017/9/5.
 */
class LoginLocalInfo(val mContext: Context) {

    var mAccessToken: String by MyPreferences(mContext, KEY_ACCESS_TOKEN, "")
    var mUid: String by MyPreferences(mContext, KEY_UID, "")
    var mExpireDate: Long by MyPreferences(mContext, KEY_EXPIRE_IN, 0L)

    var mAppId: String by MyPreferences(mContext, KEY_APP_ID, "")
    var mAppSecret: String by MyPreferences(mContext, KEY_APP_SECRET, "")
    var mRedirectUri: String by MyPreferences(mContext, KEY_REDIRECT_URI, "")

    fun needsLogin(): Boolean {
        return(mAccessToken.isEmpty() || isTokenExpired(mExpireDate))
    }

}