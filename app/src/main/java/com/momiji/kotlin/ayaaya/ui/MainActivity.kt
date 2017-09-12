package com.momiji.kotlin.ayaaya.ui

import android.content.Intent
import android.os.Bundle
import com.momiji.kotlin.ayaaya.R

class MainActivity : AbsActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        mLayout = R.layout.activity_main
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        val intent = Intent(this@MainActivity, CYWeiboContentActivity::class.java)
        startActivity(intent)
        finish()
    }
}
