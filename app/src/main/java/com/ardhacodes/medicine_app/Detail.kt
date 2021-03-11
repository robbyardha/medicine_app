package com.ardhacodes.medicine_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Detail : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val nama = intent.getStringExtra("KeyFruit")
        val deskripsi = intent.getStringExtra("KeyDesc")
        val gambar = intent.getStringExtra("KeyFoto")

        val textviewdetail: TextView = findViewById(R.id.tv_detailproduct)
        val textviewdesc: TextView = findViewById(R.id.tv_descproduct)
        val imageviewfoto: ImageView = findViewById(R.id.iv_foto)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tDet = intent.getStringExtra(EXTRA_DETAIL)

        textviewdetail.text = tName
        textviewdesc.text = tDet
        Glide.with(this@Detail)
            .load(tImg)
            .apply(RequestOptions().override(55, 55))
            .into(imageviewfoto)
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }
    override fun onClick(v: View?) {
        val intent = Intent(this@Detail, MainActivity::class.java)
        startActivity(intent)
    }
}