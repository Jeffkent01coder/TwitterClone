package com.Jeff.twitterclone.model

data class TweetItem(
    val profileImage: Int?,
    val userName: String,
    val userTag:String,
    val tweetDesc:String,
    val postImage:Int,
    val replyCount:Int,
    val retweetCount:Int,
    val likeCount: Int,
    val shareCount:Int
)
