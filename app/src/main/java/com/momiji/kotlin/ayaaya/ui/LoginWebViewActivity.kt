package com.momiji.kotlin.ayaaya.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.view.MenuItem
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.momiji.kotlin.ayaaya.R
import com.momiji.kotlin.ayaaya.login.LoginLocalInfo
import kotlinx.android.synthetic.main.activity_web_view.*

class LoginWebViewActivity : AbsActivity() {

    private lateinit var mLoginLocalInfo: LoginLocalInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        mLayout = R.layout.activity_web_view
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_web_view)
        initialize()
    }

    private fun initialize(): Unit {
        mLoginLocalInfo = LoginLocalInfo(this@LoginWebViewActivity)
        var settings = web_view_login.settings
//        settings.javaScriptEnabled = true
        settings.cacheMode = WebSettings.LOAD_NO_CACHE
        web_view_login.webViewClient = WebViewClient()
        web_view_login.loadUrl("https://www.baidu.com")
    }
}
