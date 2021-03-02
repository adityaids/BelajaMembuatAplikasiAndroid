package com.example.belajamembuataplikasiandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBarVolume: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBarVolume = findViewById(R.id.btn_bar_volume)
        btnBarVolume.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_bar_volume -> {
                val intent = Intent(this, BarVolumeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}