package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soccernames = findViewById<TextView>(R.id.tvNames)
        var counter = 1

        val teams = arrayOf<String>("Mamelodi Sundowns FC",
            "Bidvest Wits",
            "Orlando Pirates",
            "Kaizer Chiefs",
            "Cape Town City FC")

        while (teams.iterator().hasNext())
        {
            soccernames.text = "${soccernames.text} ${counter++}) ${teams.iterator().next()} \n\n"
        }


    }
}