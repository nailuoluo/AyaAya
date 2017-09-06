package com.momiji.kotlin.ayaaya.utl

/**
 * Created by Momiji on 2017/9/5.
 */
fun isTokenExpired(expireddate: Long): Boolean {
    return (expireddate <= System.currentTimeMillis())
}