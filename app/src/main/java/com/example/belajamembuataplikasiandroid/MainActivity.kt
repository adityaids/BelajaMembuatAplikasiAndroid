package com.example.belajamembuataplikasiandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBarVolume: Button
    private lateinit var btnIntent: Button
    private lateinit var btnMyView: Button
    private lateinit var btnRv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBarVolume = findViewById(R.id.btn_bar_volume)
        btnMyView = findViewById(R.id.btn_myview)
        btnIntent = findViewById(R.id.btn_intent)
        btnRv = findViewById(R.id.btn_rv)


        btnBarVolume.setOnClickListener(this)
        btnIntent.setOnClickListener(this)
        btnRv.setOnClickListener(this)
        btnMyView.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_bar_volume -> {
                val intent = Intent(this@MainActivity, BarVolumeActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_intent -> {
                val intent = Intent(this@MainActivity, BelajarIntentActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_myview -> {
                val intent = Intent(this@MainActivity, MyViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_rv -> {
                val intent = Intent(this@MainActivity, RecyclerViewActivity::class.java)
                startActivity(intent)
            }
        }
    }
}