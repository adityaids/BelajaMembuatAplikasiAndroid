package com.example.belajamembuataplikasiandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BelajarIntentActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_intent)

        val btnMove: Button = findViewById(R.id.btn_move)
        val btnMoveWithData: Button = findViewById(R.id.btn_move_with_data)
        val btnDial: Button = findViewById(R.id.btn_dial)

        btnMove.setOnClickListener(this)
        btnMoveWithData.setOnClickListener(this)
        btnDial.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move -> {
                val intent = Intent(this@BelajarIntentActivity, MoveActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_move_with_data -> {
                val moveWithData = Intent(this@BelajarIntentActivity, MoveWithDataActivity::class.java).apply {
                    putExtra(MoveWithDataActivity.EXTRA_NAME, "Aditya Purnama")
                    putExtra(MoveWithDataActivity.EXTRA_AGE, 27)
                }
                startActivity(moveWithData)
            }
            R.id.btn_dial -> {
                val number = "089686039525"
                val dialPhoneNumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
                startActivity(dialPhoneNumber)

            }
        }
    }
}