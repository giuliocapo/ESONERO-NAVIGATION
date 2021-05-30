package com.example.navigationb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FinalFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewFin = inflater.inflate(R.layout.fragment_final, container, false)
        val btnGoHome = viewFin.findViewById<Button>(R.id.btnGoHome)
        btnGoHome.setOnClickListener {
            val navToHome = FinalFragmentDirections.actionFinalFragmentToFirstFragment()
            Navigation.findNavController(viewFin).navigate(navToHome)
        }




        return viewFin
    }

}