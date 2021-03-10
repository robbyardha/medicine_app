package com.ardhacodes.medicine_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Aboutdev : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutdev)

        val btnBackHome : Button = findViewById(R.id.back)
        btnBackHome.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.back -> {
                val moveIntent = Intent(this@Aboutdev, MainActivity::class.java)
                startActivities(arrayOf(moveIntent))
            }
        }
    }


}