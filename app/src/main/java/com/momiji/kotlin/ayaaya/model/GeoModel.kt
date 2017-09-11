package com.momiji.kotlin.ayaaya.model

/**
 * Created by liuy314 on 2017/9/11.
 */
data class GeoModel(val longitude: String,
               val latitude: String,
               val city: String,
               val province: String,
               val city_name: String,
               val province_name: String,
               val address: String,
               val pinyin: String,
               val more: String)