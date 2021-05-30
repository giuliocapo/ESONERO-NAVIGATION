package com.example.navigationb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewThird = inflater.inflate(R.layout.fragment_third, container, false)
        val btnGoFin = viewThird.findViewById<Button>(R.id.btnGoFinal)

        btnGoFin.setOnClickListener {
            val navToF = ThirdFragmentDirections.actionThirdFragmentToFinalFragment()
            Navigation.findNavController(viewThird).navigate(navToF)
        }


        return viewThird
    }

}