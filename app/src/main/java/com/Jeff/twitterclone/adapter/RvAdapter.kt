package com.Jeff.twitterclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Jeff.twitterclone.databinding.PostListItemBinding
import com.Jeff.twitterclone.model.TweetItem

class RvAdapter(val tweets:ArrayList<TweetItem>): RecyclerView.Adapter<RvAdapter.TweetViewHolder>() {

    inner class TweetViewHolder(val tweet: PostListItemBinding):RecyclerView.ViewHolder(tweet.root){
        fun bind(tweetItem: TweetItem){
            tweet.ivProfileImage.setImageResource(tweetItem.profileImage!!)
            tweet.tvUserName.text = tweetItem.userName
            tweet.tvUserTag.text = tweetItem.userTag
            tweet.tvPostDescription.text = tweetItem.tweetDesc
            tweet.ivPost.setImageResource(tweetItem.postImage!!)
            tweet.tvReply.text = tweetItem.replyCount.toString()
            tweet.tvRetweet.text = tweetItem.retweetCount.toString()
            tweet.tvLike.text = tweetItem.likeCount.toString()
            tweet.tvShare.text = tweetItem.shareCount.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        return TweetViewHolder(PostListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        holder.bind(tweets[position])
    }

    override fun getItemCount(): Int {
       return tweets.size
    }
}