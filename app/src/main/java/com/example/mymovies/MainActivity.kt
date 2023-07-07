package com.example.mymovies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.moviesapp.ui.movies.MoviesFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MoviesFragment())
            .commit()
    }
}
