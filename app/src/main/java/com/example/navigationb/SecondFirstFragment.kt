package com.example.navigationb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class SecondFirstFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val viewSecF = inflater.inflate(R.layout.fragment_second_first, container, false)

        val btnGoFin = viewSecF.findViewById<Button>(R.id.btnGoFinal)
        btnGoFin.setOnClickListener {
            val navToFinal = SecondFirstFragmentDirections.actionSecondFirstFragmentToFinalFragment()
            Navigation.findNavController(viewSecF).navigate(navToFinal)
        }

        return viewSecF
    }


}