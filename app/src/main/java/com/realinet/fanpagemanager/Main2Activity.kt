package com.realinet.fanpagemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity2_main.*
import kotlinx.android.synthetic.main.activity_login.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_login_fb.setOnClickListener {
            startActivity(Intent(this@Main2Activity,LoginFbActivity::class.java))
        }
    }
}