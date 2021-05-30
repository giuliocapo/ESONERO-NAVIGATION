package com.example.navigationb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewSec= inflater.inflate(R.layout.fragment_second, container, false)
        var btnSecSec = viewSec.findViewById<Button>(R.id.btnSecondSecondFragment)

        btnSecSec.setOnClickListener {
            val navToSEcSec = SecondFragmentDirections.actionSecondFragmentToSecondSecondFragment()
            Navigation.findNavController(viewSec).navigate(navToSEcSec)
        }

        return viewSec
    }

}