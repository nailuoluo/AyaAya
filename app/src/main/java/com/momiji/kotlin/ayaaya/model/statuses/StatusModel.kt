package com.momiji.kotlin.ayaaya.model.statuses

import com.momiji.kotlin.ayaaya.model.GeoModel
import java.awt.font.TextAttribute

/**
 * Created by liuy314 on 2017/9/11.
 */
data class StatusModel(var created_at: String,
                       var id: Long,
                       var mid: String,
                       var idstr: String,
                       var text: String,
                       var textLength: Int,
                       var source_allowclick: Int,
                       var source_type: Int,
                       var source: String,
                       var favorited: Boolean,
                       var truncated: Boolean,
                       var in_reply_to_status_id: String = "",
                       var in_reply_to_user_id: String,
                       var in_reply_to_screen_name: String,
                       var pic_urls: List<ThumbnailPicModel>,
                       var thumbnail_pic: String,
                       var bmiddle_pic: String,
                       var original_pic: String,
                       var geo: GeoModel,
                       var is_paid: Boolean,
                       var mblog_vip_type: Int,
                       var filterID: String,
                       var reposts_count: Int,
                       var comments_count: Int,
                       var attitudes_count: Int,
                       var isLongText: Boolean,
                       var liked: Boolean,
                       var mlevel: Int,
                       var biz_feature: Long,
                       var hasActionTypeCard: Int,
                       var retweeted_status: StatusModel
                       )