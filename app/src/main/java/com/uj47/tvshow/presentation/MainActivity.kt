package com.uj47.tvshow.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.uj47.tvshow.R
import com.uj47.tvshow.common.Resource
import com.uj47.tvshow.common.logView
import com.uj47.tvshow.presentation.tvshow.TvShowListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var viewModel: TvShowListViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel()
    }

    fun viewModel(){

        viewModel = ViewModelProvider(this@MainActivity)[TvShowListViewModel::class.java]
        viewModel.tvShow.observe(this@MainActivity){ result ->

            when(result){
                is Resource.Loading -> {
                    Toast.makeText(this@MainActivity,"Loading!",Toast.LENGTH_SHORT).show()
                }
                is Resource.Success -> {
                    logView("MainActivity","success: " + result.data)
                }
                is Resource.Error -> {
                    logView("MainActivity","err: " + result.message)
                    Toast.makeText(this@MainActivity,"" + result.message,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}