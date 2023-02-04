package com.asustug.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asustug.unittesting.utils.Helper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Helper().isPalindrome("hello")
    }
}