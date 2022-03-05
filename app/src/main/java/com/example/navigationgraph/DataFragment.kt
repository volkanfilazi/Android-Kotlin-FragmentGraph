package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class DataFragment : Fragment() {

    private lateinit var dataToHome : Button
    private lateinit var getTv : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_data, container, false)

        dataToHome = view.findViewById(R.id.dataToHome)
        getTv = view.findViewById(R.id.getTv)
        val bundle = Bundle()
        val test = bundle.getBundle("123")
        getTv.setText(test.toString())

        buttonIsActive()

        return view
    }

    fun buttonIsActive(){
        dataToHome.setOnClickListener {
            findNavController().navigate(R.id.action_dataFragment_to_homeFragment)
        }
    }


}