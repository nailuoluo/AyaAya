package com.momiji.kotlin.ayaaya.model.exception

/**
 * Created by Momiji on 2017/9/10.
 */
data class ErrorModel(val error: String,
                      val error_code: String,
                      val request: String)