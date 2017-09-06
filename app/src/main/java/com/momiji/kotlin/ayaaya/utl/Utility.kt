@file:JvmName("Utility")
package com.momiji.kotlin.ayaaya.utl

import android.util.Base64


/**
 * Created by Momiji on 2017/9/5.
 */
fun isTokenExpired(expireddate: Long): Boolean {
    return (expireddate <= System.currentTimeMillis())
}

fun String.decodeLoginData(): List<String> =
        String(Base64.decode(this, Base64.URL_SAFE or Base64.NO_WRAP or Base64.NO_PADDING or Base64.NO_CLOSE)).split(BM_SEPERATOR)
