package com.ardhacodes.medicine_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var moveSplash = Intent(this@Splash, MainActivity::class.java)
        startActivity(moveSplash)
        finish()
        //setContentView(R.layout.activity_splash)
    }
}