package com.momiji.kotlin.ayaaya.module.login

import android.content.Context
import com.momiji.kotlin.ayaaya.module.BaseModule
import com.momiji.kotlin.ayaaya.module.OAUTH2_ACCESS_AUTHORIZE
import com.momiji.kotlin.ayaaya.utl.BM_CODE
import com.momiji.kotlin.ayaaya.utl.decodeLoginData


/**
 * Created by liuy314 on 2017/9/7.
 */
class LoginModule(context: Context): BaseModule(context) {

    fun getOAuthPageUrl(): String {
        val data: List<String> = BM_CODE.decodeLoginData()
        var login: LoginLocalInfo = LoginLocalInfo(mContext)

        val appid = data[0].trim()
        val appsecret = data[1].trim()
        val redirecturl = data[2].trim()
        val scope = data[3].trim()
        val pkgname = data[4].trim()

        login.mAppId = appid
        login.mAppSecret = appsecret
        login.mRedirectUri = redirecturl

        val url = OAUTH2_ACCESS_AUTHORIZE + "?" + "client_id=" + appid +
                "&response_type=token&redirect_uri=" + redirecturl +
                "&key_hash=" + appsecret +
                "&packagename=" + pkgname +
                "&display=mobile" + "&scope=" + scope
        return url
    }

}

