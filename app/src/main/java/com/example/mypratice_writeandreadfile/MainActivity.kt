package com.example.mypratice_writeandreadfile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_writeandreadfile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val withBasicWay = WithBasicWay()
        val withBufferedReader = WithBufferedReader()
        val withInputStream = WithInputStream()

        //自行選擇要測試的功能放到下面的Listener裡
        binding.btnWriteFile.setOnClickListener {

        }
        binding.btnReadFile.setOnClickListener {

        }
        binding.btnToastDetail.setOnClickListener {

        }

        setContentView(binding.root)
    }
}