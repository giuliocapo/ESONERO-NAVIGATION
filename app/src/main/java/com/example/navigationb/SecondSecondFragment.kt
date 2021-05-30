package com.example.navigationb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class SecondSecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewSecSec = inflater.inflate(R.layout.fragment_second_second, container, false)
        val btnGoToFin = viewSecSec.findViewById<Button>(R.id.btnGoFinal)

        btnGoToFin.setOnClickListener {
            val navToFin = SecondSecondFragmentDirections.actionSecondSecondFragmentToFinalFragment()
            Navigation.findNavController(viewSecSec).navigate(navToFin)
        }

        return viewSecSec
    }


}