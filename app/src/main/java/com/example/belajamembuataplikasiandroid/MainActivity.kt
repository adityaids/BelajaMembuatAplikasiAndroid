package com.example.belajamembuataplikasiandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBarVolume: Button
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBarVolume = findViewById(R.id.btn_bar_volume)
        btnBarVolume.setOnClickListener(this)

        btnIntent = findViewById(R.id.btn_intent)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_bar_volume -> {
                val intent = Intent(this@MainActivity, BarVolumeActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_intent -> {
                val intent = Intent(this@MainActivity, BelajarIntent::class.java)
                startActivity(intent)
            }
        }
    }
}