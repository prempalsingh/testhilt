package com.prempal.hilt

import android.app.Activity
import android.content.Intent
import com.prempal.detail.DetailActivity
import com.prempal.home.Navigator
import javax.inject.Inject

class HomeNavigator @Inject constructor() : Navigator {
    override fun toDetailActivity(activity: Activity) {
        val intent = Intent(activity, DetailActivity::class.java)
        activity.startActivity(intent)
    }
}