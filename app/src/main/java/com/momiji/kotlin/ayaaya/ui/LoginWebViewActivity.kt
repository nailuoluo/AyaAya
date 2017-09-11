package com.momiji.kotlin.ayaaya.ui

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.momiji.kotlin.ayaaya.R
import com.momiji.kotlin.ayaaya.module.exception.ExceptionModule
import com.momiji.kotlin.ayaaya.module.oauth.OAuthModule
import com.momiji.kotlin.ayaaya.module.oauth.login.LoginLocalInfo
import com.momiji.kotlin.ayaaya.module.oauth.login.LoginModule
import kotlinx.android.synthetic.main.activity_login_web_view.*


class LoginWebViewActivity : AbsActivity() {

    private lateinit var mLoginLocalInfo: LoginLocalInfo
    private lateinit var mOAuthUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        mLayout = R.layout.activity_login_web_view
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_web_view)
        initialize()
    }

    private fun initialize(): Unit {
        mLoginLocalInfo = LoginLocalInfo(this@LoginWebViewActivity)
        var settings = web_view_login.settings
        settings.javaScriptEnabled = true
        settings.cacheMode = WebSettings.LOAD_NO_CACHE
        web_view_login.webViewClient = object:WebViewClient() {

//            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
//                var url: Uri = request!!.url
//                if (url.toString().startsWith(mLoginLocalInfo.mRedirectUri)) {
//                    view!!.stopLoading()
//                    handleRedirectUrl(url.toString())
//                    return true
//                } else
//                return super.shouldOverrideUrlLoading(view, request)
//            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                web_view_progressbar.visibility = View.VISIBLE
                if (url!!.startsWith(mLoginLocalInfo.mRedirectUri)) {
                    view!!.stopLoading()
                    handleRedirectUrl(url)
                    return
                } else super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                web_view_progressbar.visibility = View.GONE
                super.onPageFinished(view, url)
            }
        }
        mOAuthUrl = LoginModule(this@LoginWebViewActivity).getOAuthPageUrl()
        web_view_login.loadUrl(mOAuthUrl)
    }

    private fun handleRedirectUrl(url: String) {
        if (!url.contains("error")) {
            val tokenIndex = url.indexOf("access_token=")
            val expiresIndex = url.indexOf("expires_in=")
            val token = url.substring(tokenIndex + 13, url.indexOf("&", tokenIndex))
            val expiresIn = url.substring(expiresIndex + 11, url.indexOf("&", expiresIndex))
            mLoginLocalInfo.mAccessToken = token
            mLoginLocalInfo.mExpireDate = System.currentTimeMillis() + expiresIn.toLong()

            requestUid()

            // to create the result data back to CYWeiboContentActivity
            var intent = Intent()
            this@LoginWebViewActivity.setResult(android.app.Activity.RESULT_OK, intent)
        } else {
            Toast.makeText(this@LoginWebViewActivity, "error", Toast.LENGTH_SHORT).show()
            var intent = Intent()
            this@LoginWebViewActivity.setResult(android.app.Activity.RESULT_CANCELED, intent)
        }
        this@LoginWebViewActivity.finish()
    }

    private fun requestUid() {
        val oauthModule = OAuthModule(this@LoginWebViewActivity)
        oauthModule.getUid().subscribe({
            uidModel->
            mLoginLocalInfo.mUid = uidModel.uid
        }, {
            e -> Toast.makeText(this@LoginWebViewActivity, ExceptionModule.handle(e), Toast.LENGTH_LONG).show()
        })
    }
}
