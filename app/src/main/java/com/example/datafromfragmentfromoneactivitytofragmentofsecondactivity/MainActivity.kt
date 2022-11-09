package com.example.datafromfragmentfromoneactivitytofragmentofsecondactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creation of fragmentOfFirstActivity
        val fragmentOfFirstActivity = FragmentOfFirstActivity()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragmentOfFirstActivity)
        fragmentTransaction.commit()


    }
}