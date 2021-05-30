package com.example.navigationb.viewPager.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationb.R

class FirstScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewF = inflater.inflate(R.layout.fragment_first_screen, container, false)

        val viewP = activity?.findViewById<ViewPager2>(R.id.viewPager)

        viewF.findViewById<TextView>(R.id.tvNext).setOnClickListener {

         viewP?.currentItem=1

        }

        return viewF
    }

}