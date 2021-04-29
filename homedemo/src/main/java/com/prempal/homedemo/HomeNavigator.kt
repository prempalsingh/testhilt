package com.prempal.homedemo

import android.app.Activity
import android.widget.Toast
import com.prempal.home.Navigator
import javax.inject.Inject

class HomeNavigator @Inject constructor() : Navigator {
    override fun toDetailActivity(activity: Activity) {
        Toast.makeText(activity, "To Detail Activity", Toast.LENGTH_SHORT).show()
    }
}