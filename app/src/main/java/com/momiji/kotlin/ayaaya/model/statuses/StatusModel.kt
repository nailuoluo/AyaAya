package com.momiji.kotlin.ayaaya.model.statuses

import com.momiji.kotlin.ayaaya.model.GeoModel

/**
 * Created by liuy314 on 2017/9/11.
 */
data class StatusModel(var created_at: String,
                       var id: Long,
                       var text: String,
                       var source: String,
                       var favorited: Boolean,
                       var truncated: Boolean,
                       var in_reply_to_status_id: String = "",
                       var in_reply_to_user: String,
                       var geo: GeoModel,
                       var mid: String,
                       var reposts_count: Int,
                       var comments_count: Int)