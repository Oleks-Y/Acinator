package com.example.acinator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_STRING = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var nameSong = findViewById<TextView>(R.id.nameSong)

        val intent : Intent = getIntent()

        var nameOfSong :String = intent.getStringExtra("SongName")
        nameSong.text==nameOfSong
    }
}
