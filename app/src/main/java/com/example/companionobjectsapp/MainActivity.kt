package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var et_choose: EditText
    lateinit var btn: Button
    lateinit var main: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_choose = findViewById(R.id.et_choose)
        btn = findViewById(R.id.btn)
        main = findViewById(R.id.main)

        btn.setOnClickListener {

            if (et_choose.text.isNotEmpty()) {
                var text = et_choose.text.toString().lowercase()
                if (text == "day" || text == "night") {
                    ChangeBackground.Background(main, text)
                }
                else {
                    Snackbar.make(main, "Please Type Day or Night just without space", Snackbar.LENGTH_LONG)
                        .show()
                }
            }
            et_choose.clearFocus()
            et_choose.text.clear()
        }
    }
}