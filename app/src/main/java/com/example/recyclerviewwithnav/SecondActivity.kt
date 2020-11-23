package com.example.recyclerviewwithnav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewwithnav.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_second)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.secondActivityTitle = "This is the second activity"
    }
}