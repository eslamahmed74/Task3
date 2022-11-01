package com.example.task3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.task3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        val colorsList = listOf<String>("#FFBB86FC","#FF6200EE","#FF3700B3","#FF03DAC5","#FF018786","#FF000000","#FFFFFFFF")
        val adapter=ArrayAdapter(this
        ,android.R.layout.simple_list_item_1,colorsList!!)
        binding.listview.adapter=adapter
    }


}