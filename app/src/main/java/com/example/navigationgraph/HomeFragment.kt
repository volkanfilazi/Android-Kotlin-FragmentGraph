package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    private lateinit var homeToDataBtn : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        homeToDataBtn = view.findViewById(R.id.homeToData)


        buttonIsActive()

        return view
    }

    fun buttonIsActive(){
        homeToDataBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_dataFragment)
        }
    }


}