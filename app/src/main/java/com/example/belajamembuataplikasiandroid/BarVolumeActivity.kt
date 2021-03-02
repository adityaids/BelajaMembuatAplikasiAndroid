
package com.example.belajamembuataplikasiandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BarVolumeActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var tvResult: TextView
    private lateinit var edtLength: EditText
    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var btnHitung: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_volume)

        tvResult = findViewById(R.id.tv_result)
        edtLength = findViewById(R.id.edt_length)
        edtHeight = findViewById(R.id.edt_heigth)
        edtWidth = findViewById(R.id.edt_width)
        btnHitung = findViewById(R.id.btn_hitung)

        btnHitung.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_hitung) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()
            var isEmptyField = false

            when {
                inputLength.isEmpty() -> {
                    isEmptyField = true
                    edtLength.error = "Field ini tidak boleh kosong"
                }
                inputWidth.isEmpty() -> {
                    isEmptyField = true
                    edtWidth.error = "Field ini tidak boleh kosong"
                }
                inputHeight.isEmpty() -> {
                    isEmptyField = true
                    edtHeight.error = "Field ini tidak boleh kosong"
                }
            }

            if (!isEmptyField) {
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                tvResult.text = volume.toString()
            }
        }
    }
}