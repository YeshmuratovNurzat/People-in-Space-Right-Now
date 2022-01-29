package com.etoolkit.peopleinspacerightnow.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.etoolkit.peopleinspacerightnow.R
import com.etoolkit.peopleinspacerightnow.data.RetrofitInstance
import com.etoolkit.peopleinspacerightnow.domain.model.Astro
import com.etoolkit.peopleinspacerightnow.presentation.adapter.AstroAdapter
import com.etoolkit.peopleinspacerightnow.presentation.view_model.AstroViewModel
import com.etoolkit.peopleinspacerightnow.presentation.view_model.AstroViewModelFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var astroAdapter: AstroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        Log.e("My","Activity created")

        create()
    }

    fun create() {

        val viewModelAstro = ViewModelProvider(this,AstroViewModelFactory()).get(AstroViewModel::class.java)

        astroAdapter = AstroAdapter()
        recyclerView.adapter = astroAdapter
        viewModelAstro.getAllData()

        viewModelAstro.listData.observe(this, { list ->
            list.body()?.let { astroAdapter.setList(it?.people) }
        })
    }
}

