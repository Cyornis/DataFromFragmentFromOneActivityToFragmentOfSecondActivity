package com.example.datafromfragmentfromoneactivitytofragmentofsecondactivity

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FragmentOfFirstActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view  = inflater.inflate(R.layout.fragment_of_first_activity, container, false)
        val name = view.findViewById<EditText>(R.id.name_et)
        val btn = view.findViewById<Button>(R.id.btn_go)

        btn.setOnClickListener {
            val intent = Intent(activity,MainActivity2::class.java)
            intent.putExtra("NAME",name.text.toString())
            startActivity(intent)
        }
        // Inflate the layout for this fragment
        return view
    }
}