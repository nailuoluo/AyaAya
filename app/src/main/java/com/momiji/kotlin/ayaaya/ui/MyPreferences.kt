package com.momiji.kotlin.ayaaya.ui

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Momiji on 2017/9/4.
 */
class MyPreferences<T>(val mContext: Context, val mName: String, val mDefault: T): ReadWriteProperty<Any?, T> {

    private val mPref by lazy { mContext.getSharedPreferences("default", Context.MODE_PRIVATE) }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return findPreference(mName, mDefault)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putPreference(mName, value)
    }

    private fun <U>findPreference(name: String, default: U): U = with(mPref) {
        val res: Any = when (default) {
            is Long -> getLong(name, default)
            is String -> getString(name, default)
            is Int -> getInt(name, default)
            is Boolean -> getBoolean(name, default)
            is Float -> getFloat(name, default)
            else -> throw IllegalArgumentException("This type can be saved into Preferences")
        }
        res as U
    }

    private fun <U>putPreference(name: String, value: U) = with(mPref.edit()) {
        when (value) {
            is Long -> putLong(name, value)
            is String -> putString(name, value)
            is Int -> putInt(name, value)
            is Boolean -> putBoolean(name, value)
            is Float -> putFloat(name, value)
            else -> throw IllegalArgumentException("This type can be saved into Preferences")
        }.apply()
    }
}