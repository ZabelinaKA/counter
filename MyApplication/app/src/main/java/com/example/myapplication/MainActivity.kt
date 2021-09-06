package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
// Мои изменения
    //new changes123
    //  changes supernew
    fun counter (view: View) {
        val countString = EditText.text.tostring()
        var count: Int = Integer.parseInt(countstring)
        count++
        EditText.text = count.Tostring()
    }
}