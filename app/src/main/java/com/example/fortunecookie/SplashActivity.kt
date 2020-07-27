package com.example.fortunecookie

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val mIntent = Intent(this, RandomActivity::class.java);
            startActivity(mIntent);
            finish();
        },3000); // 3 segundos
    }
}