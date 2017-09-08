package com.momiji.kotlin.ayaaya.ui

import android.content.Intent
import android.os.Bundle
import com.momiji.kotlin.ayaaya.R
import com.momiji.kotlin.ayaaya.module.login.LoginLocalInfo
import com.momiji.kotlin.ayaaya.utl.REQUEST_CODE_LOGIN_WEB_VIEW_ACTIVIT

class CYWeiboContentActivity : AbsActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        mLayout = R.layout.activity_cyweibo_content
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cyweibo_content)
        initialize()
    }

    private fun initialize(): Unit {
        var login = LoginLocalInfo(this@CYWeiboContentActivity)
        if (login.needsLogin()) {
            val intent = Intent(this@CYWeiboContentActivity, LoginWebViewActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_LOGIN_WEB_VIEW_ACTIVIT)
        }
        else {
            return
        }
    }



}
