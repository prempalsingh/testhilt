package com.prempal.home

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.prempal.lib.Lib
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: Navigator

    @Inject
    lateinit var lib: Lib

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(application, lib.sayHi(), Toast.LENGTH_SHORT).show()
            navigator.toDetailActivity(this)
        }
    }
}
