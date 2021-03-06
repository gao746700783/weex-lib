package com.dede.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.smart.common.weex.ui.WeexPageActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toWeexPage(v: View) {
        val intent = Intent(this, WeexPageActivity::class.java)
        intent.putExtra(WeexPageActivity.EXTRA_URL, "http://192.168.0.67:8081/dist/index.js")
        startActivity(intent)
    }
}
