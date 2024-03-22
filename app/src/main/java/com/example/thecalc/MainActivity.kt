package com.example.thecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etNumber1 : EditText? = null  // on the activity etNum1
    private var etNumber2 : EditText? = null  // on the activity etNum2
    private var tvDisplay : TextView? = null  // on the activity tvDisp
    override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1= findViewById<EditText>(R.id.etNum1)
        etNumber2= findViewById<EditText>(R.id.etNum2)
        tvDisplay= findViewById<TextView>(R.id.tvDisp)

        val btnAddition= findViewByID<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{
            addittion()
        }

        val btnSubtraction= findViewByID<Button>(R.id.btnSub)
        btnAddition.setOnClickListener{
            subtraction()
        }
        val btnMultiplication= findViewByID<Button>(R.id.btnMul)
        btnAddition.setOnClickListener{
            multiplication()
        }
        val btnDivision= findViewByID<Button>(R.id.btnDiv)
        btnAddition.setOnClickListener{
            division()
        }
        private fun add({
            var intNum1: int=0
        })
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}