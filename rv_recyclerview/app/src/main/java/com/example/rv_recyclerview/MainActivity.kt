package com.example.rv_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvLatihan: RecyclerView
    private var list: ArrayList<dataLatihan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLatihan = findViewById(R.id.rv_dataku)
        rvLatihan.setHasFixedSize(true)
        list.addAll(dataSample.listData)
        deklarasiRecyclerView()
    }

    private fun deklarasiRecyclerView(){
        rvLatihan.layoutManager = LinearLayoutManager(this)
        val adapterku = adapterData(list)
        rvLatihan.adapter = adapterku
    }
}