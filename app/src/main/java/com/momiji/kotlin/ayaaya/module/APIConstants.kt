@file:JvmName("APIConstants")
package com.momiji.kotlin.ayaaya.module

/**
 * Created by liuy314 on 2017/9/7.
 */
const val SINA_BASE_URL = "https://api.weibo.com/2/"

// Login
const val OAUTH2_ACCESS_AUTHORIZE = "https://open.weibo.cn/oauth2/authorize"
const val OAUTH2_ACCESS_TOKEN = SINA_BASE_URL + "oauth2/access_token"

// User / Account
const val GET_UID = SINA_BASE_URL + "account/get_uid.json"
const val USER_SHOW = SINA_BASE_URL + "users/show.json"

// Statuses
const val HOME_TIMELINE = SINA_BASE_URL + "statuses/home_timeline.json"
const val USER_TIMELINE = SINA_BASE_URL + "statuses/user_timeline.json"
const val BILATERAL_TIMELINE = SINA_BASE_URL + "statuses/bilateral_timeline.json"
const val MENTIONS = SINA_BASE_URL + "statuses/mentions.json"
const val REPOST_TIMELINE = SINA_BASE_URL + "statuses/repost_timeline.json"
const val UPDATE = SINA_BASE_URL + "statuses/update.json"
const val UPLOAD = SINA_BASE_URL + "statuses/upload.json"
const val REPOST = SINA_BASE_URL + "statuses/repost.json"
const val DESTROY = SINA_BASE_URL + "statuses/destroy.json"
const val UPLOAD_PIC = SINA_BASE_URL + "statuses/upload_pic.json"
const val UPLOAD_URL_TEXT = SINA_BASE_URL + "statuses/upload_url_text.json"
const val QUERY_ID = SINA_BASE_URL + "statuses/queryid.json"
const val QUERY_MID = SINA_BASE_URL + "statuses/querymid.json"
const val SHOW = SINA_BASE_URL + "statuses/show.json"

// Comments
const val COMMENTS_TIMELINE = SINA_BASE_URL + "comments/timeline.json"
const val COMMENTS_MENTIONS = SINA_BASE_URL + "comments/mentions.json"
const val COMMENTS_TO_ME = SINA_BASE_URL + "comments/to_me.json"
const val COMMENTS_SHOW = SINA_BASE_URL + "comments/show.json"
const val COMMENTS_CREATE = SINA_BASE_URL + "comments/create.json"
const val COMMENTS_REPLY = SINA_BASE_URL + "comments/reply.json"
const val COMMENTS_DESTROY = SINA_BASE_URL + "comments/destroy.json"

// Favorites
const val FAVORITES_CREATE = SINA_BASE_URL + "favorites/create.json"
const val FAVORITES_DESTROY = SINA_BASE_URL + "favorites/destroy.json"
const val FAVORITES_LIST = SINA_BASE_URL + "favorites.json"

// Search
const val SEARCH_TOPICS = SINA_BASE_URL + "search/topics.json"
const val SEARCH_STATUSES = SINA_BASE_URL + "search/statuses.json"
const val SEARCH_USERS = SINA_BASE_URL + "search/users.json"
const val SEARCH_SUGGESTIONS_AT_USERS = SINA_BASE_URL + "search/suggestions/at_users.json"

// Friendships
const val FRIENDSHIPS_FRIENDS = SINA_BASE_URL + "friendships/friends.json"
const val FRIENDSHIPS_FOLLOWERS = SINA_BASE_URL + "friendships/followers.json"
const val FRIENDSHIPS_CREATE = SINA_BASE_URL + "friendships/create.json"
const val FRIENDSHIPS_DESTROY = SINA_BASE_URL + "friendships/destroy.json"
const val FRIENDSHIPS_GROUPS = SINA_BASE_URL + "friendships/groups.json"
const val FRIENDSHIPS_GROUPS_IS_MEMBER = SINA_BASE_URL + "friendships/groups/is_member.json"
const val FRIENDSHIPS_GROUPS_TIMELINE = SINA_BASE_URL + "friendships/groups/timeline.json"
const val FRIENDSHIPS_GROUPS_CREATE = SINA_BASE_URL + "friendships/groups/create.json"
const val FRIENDSHIPS_GROUPS_DESTROY = SINA_BASE_URL + "friendships/groups/destroy.json"
const val FRIENDSHIPS_GROUPS_MEMBERS_ADD = SINA_BASE_URL + "friendships/groups/members/add.json"
const val FRIENDSHIPS_GROUPS_MEMBERS_DESTROY = SINA_BASE_URL + "friendships/groups/members/destroy.json"

// Direct Message
const val DIRECT_MESSAGES = SINA_BASE_URL + "direct_messages.json"
const val DIRECT_MESSAGES_USER_LIST = SINA_BASE_URL + "direct_messages/user_list.json"
const val DIRECT_MESSAGES_CONVERSATION = SINA_BASE_URL + "direct_messages/conversation.json"
const val DIRECT_MESSAGES_SEND = SINA_BASE_URL + "direct_messages/new.json"
const val DIRECT_MESSAGES_THUMB_PIC = "https://upload.api.weibo.com/2/mss/msget_thumbnail?fid=%d&access_token=%s&high=%d&width=%d"
const val DIRECT_MESSAGES_ORIG_PIC = "https://upload.api.weibo.com/2/mss/msget?fid=%d&access_token=%s"
const val DIRECT_MESSAGES_UPLOAD_PIC = "https://upload.api.weibo.com/2/mss/upload.json?tuid=%s"

// Remind
const val REMIND_UNREAD_COUNT = "https://rm.api.weibo.com/2/remind/unread_count.json"
const val REMIND_UNREAD_SET_COUNT = "https://rm.api.weibo.com/2/remind/set_count.json"

// Attitude
const val ATTITUDE_CREATE = SINA_BASE_URL + "attitudes/create.json"
const val ATTITUDE_DESTROY = SINA_BASE_URL + "attitudes/destroy.json"

// Short Url
const val SHORT_URL_SHORTEN = SINA_BASE_URL + "short_url/shorten.json"
const val SHORT_URL_EXPAND = SINA_BASE_URL + "short_url/expand.json"

//// Feedback and crash report
//val LOG_API = "https://bug.black.lighting/bl-crashlog"
//val FEEDBACK_API = "https://bug.black.lighting/bl-feedback"
//
////No one hates splashes
//val SPLASHES_API = "https://misc.typeblog.net/splash"