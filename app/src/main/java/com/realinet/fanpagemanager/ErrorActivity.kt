package com.realinet.fanpagemanager

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_error.*
import java.util.*


class ErrorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
    }

    override fun onStop() {
        super.onStop()

        progress_bar.visibility = View.VISIBLE
        tv_error.visibility = View.GONE
    }
    override fun onResume() {
        super.onResume()
        val min = 3000
        val max = 6000

        val r = Random()
        val i1: Int = r.nextInt(max - min + 1) + min
        object : CountDownTimer(i1.toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                progress_bar.visibility = View.GONE
                tv_error.visibility = View.VISIBLE
            }
        }.start()
    }
}