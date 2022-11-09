package com.example.datafromfragmentfromoneactivitytofragmentofsecondactivity

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentOfSecondActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_of_second_activity, container, false)
        val name_tv = view.findViewById<TextView>(R.id.name_tv)

        val showData = arguments?.getString("NAME","Data Not Recived").toString()
        Log.d("ANJALI", showData)
        name_tv.text = showData
        // Inflate the layout for this fragment
        return view
    }
}