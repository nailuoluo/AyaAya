package com.momiji.kotlin.ayaaya.model.statuses

/**
 * Created by liuy314 on 2017/9/11.
 */

data class UserTimelineModel(var previous_cursor: Int,
                             var total_number: Int,
                             var statuses: List<StatusModel>)