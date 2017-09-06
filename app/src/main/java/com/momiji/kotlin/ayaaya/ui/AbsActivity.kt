package com.momiji.kotlin.ayaaya.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.momiji.kotlin.ayaaya.R

open class AbsActivity : AppCompatActivity() {

    open protected var mLayout: Int = R.layout.activity_abs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mLayout)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {

            android.R.id.home -> {
                onBackPressed()
                true
            }

        }

        return super.onOptionsItemSelected(item)
    }
}
