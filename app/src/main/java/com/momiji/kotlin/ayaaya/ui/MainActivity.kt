package com.momiji.kotlin.ayaaya.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.momiji.kotlin.ayaaya.R
import com.momiji.kotlin.ayaaya.login.LoginLocalInfo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize(): Unit {
        val login = LoginLocalInfo(this@MainActivity)
        if(login.needsLogin()) {
            val intent = Intent(this@MainActivity, CYWeiboContentActivity::class.java)
            startActivity(intent)
            finish()
        } else {

        }
    }
}
