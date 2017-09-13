package com.momiji.kotlin.ayaaya.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.momiji.kotlin.ayaaya.R
import com.momiji.kotlin.ayaaya.module.oauth.login.LoginLocalInfo
import com.momiji.kotlin.ayaaya.module.statuses.StatusesModule
import com.momiji.kotlin.ayaaya.ui.adapter.StatusAdapter
import com.momiji.kotlin.ayaaya.utl.HER_UID
import com.momiji.kotlin.ayaaya.utl.REQUEST_CODE_LOGIN_WEB_VIEW_ACTIVIT
import kotlinx.android.synthetic.main.activity_cyweibo_content.*

class CYWeiboContentActivity : AbsActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        mLayout = R.layout.activity_cyweibo_content
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cyweibo_content)
        initialize()
    }

    private fun initialize() {
        var login = LoginLocalInfo(this@CYWeiboContentActivity)
        if (login.needsLogin()) {
            val intent = Intent(this@CYWeiboContentActivity, LoginWebViewActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_LOGIN_WEB_VIEW_ACTIVIT)
        }
        else {
            Log.d("Logininfo------", login.mAccessToken)
            Log.d("Logininfo------", login.mUid)

            recylerview_cyweibo_statuses.layoutManager = LinearLayoutManager(this@CYWeiboContentActivity)
            getCYWeiboContent()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            REQUEST_CODE_LOGIN_WEB_VIEW_ACTIVIT -> {
                when (resultCode) {
                    RESULT_OK -> getCYWeiboContent()
                    RESULT_CANCELED ->finish()
                }
            }
            else -> super.onActivityResult(requestCode, resultCode, data)
        }

    }

    private fun getCYWeiboContent() {
        val statusesModule = StatusesModule(this@CYWeiboContentActivity)
        statusesModule.getUserTimeline(HER_UID).subscribe({
            userTimeLineModel ->
            recylerview_cyweibo_statuses.adapter = StatusAdapter(userTimeLineModel.statuses)
            recylerview_cyweibo_statuses.adapter.notifyDataSetChanged()
        })
    }



}
