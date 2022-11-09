package com.example.datafromfragmentfromoneactivitytofragmentofsecondactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val getresult =  intent.getStringExtra("NAME").toString()

        val bundle = Bundle()
        bundle.putString("NAME",getresult)
        Log.d("ANJALI",getresult)

        val fragmentOfSecondActivity = FragmentOfSecondActivity()
        fragmentOfSecondActivity.arguments= bundle
        val fragmentTransaction2 = supportFragmentManager.beginTransaction()
        fragmentTransaction2.replace(R.id.fragment_container2,fragmentOfSecondActivity)
        fragmentTransaction2.commit()
    }
}