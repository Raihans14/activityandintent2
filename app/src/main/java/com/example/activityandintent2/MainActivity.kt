package com.example.activityandintent2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var inputWidth: EditText
    private lateinit var inputHeight: EditText
    private lateinit var inputLength: EditText
    private lateinit var result: TextView
    private lateinit var btn: Button

    companion object {
        private const val STATE_RESULT = "state_result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputWidth = findViewById(R.id.edt_lebar)
        inputHeight = findViewById(R.id.edt_tinggi)
        inputLength = findViewById(R.id.edt_panjang)
        btn = findViewById(R.id.btn_result)
        result = findViewById(R.id.result)

        btn.setOnClickListener(this)
    }

    
}