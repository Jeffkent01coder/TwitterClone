package com.Jeff.twitterclone.model

import com.Jeff.twitterclone.R

class Data {
    companion object{
        fun getTweets(): ArrayList<TweetItem> {
            return arrayListOf<TweetItem>(
                TweetItem(
                    R.drawable.j,
                    "Geoffrey",
                    "@kent",
                    "Hello Just made one million dollars in a week",
                    R.drawable.n,
                    23,
                    55,
                    66,
                    756
            ),
            TweetItem(
                R.drawable.j,
                "George",
                "@georgeee",
                "Hello Just got my new job today",
                R.drawable.n,
                23,
                55,
                66,
                756
            )
            )
        }
    }
}