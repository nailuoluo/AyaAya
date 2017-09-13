@file:JvmName("Utility")
package com.momiji.kotlin.ayaaya.utl

import android.content.Context
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.util.Base64
import com.momiji.kotlin.ayaaya.model.EmotionModel
import kotlinx.android.synthetic.main.activity_login_web_view.view.*
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by Momiji on 2017/9/5.
 */
fun isTokenExpired(expireddate: Long): Boolean {
    return (expireddate <= System.currentTimeMillis())
}

fun String.decodeLoginData(): List<String> =
        String(Base64.decode(this, Base64.URL_SAFE or Base64.NO_WRAP or Base64.NO_PADDING or Base64.NO_CLOSE)).split(BM_SEPERATOR)

/*
fun getWeiboStatusContent(context: Context, text: String): SpannableString {
    val AT_PATTERN = Pattern.compile(PATTERN_AT)
    val TAG_PATTERN = Pattern.compile(PATTERN_TAG)
    val URL_PATTERN = Pattern.compile(PATTERN_URL)
    val EMOJI_PATTERN = Pattern.compile(PATTERN_EMOJI)

    val spannableString = SpannableStringBuilder(text)

    val at: Matcher = AT_PATTERN.matcher(spannableString)
    while (at.find()) {
        val atUserName: String = at.group()
        var start: Int = at.start()
//        spannableString.setSpan( )
    }

    val tag: Matcher = TAG_PATTERN.matcher(spannableString)
    while (tag.find()) {
        val tagName: String = tag.group()
        var start: Int = at.start()
//        spannableString.setSpan()
    }

    val url: Matcher = URL_PATTERN.matcher(spannableString)
    while (url.find()) {
        val urlString: String = url.group()
        var start = url.start()
//        spannableString.setSpan()
    }

    val emoji: Matcher = EMOJI_PATTERN.matcher(spannableString)
    while (url.find()) {
        val emojiKey: String = emoji.group()
        var start: Int = emoji.start()
        var imgResId: Int = EmotionModel.mEmojiMap.get(emojiKey)!!

    }
}
//*/