package com.example.navigationb

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.solver.widgets.ConstraintWidget.VISIBLE
import androidx.constraintlayout.widget.ConstraintSet.VISIBLE
import androidx.core.view.isVisible
import androidx.navigation.Navigation
import com.example.navigationb.MainActivity
import com.example.navigationb.MainActivity.Companion.binding
import com.example.navigationb.databinding.ActivityMainBinding


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //image
        //ImageView.inflate(R.drawable.run1)

        binding.bottomNavigationView.isVisible = true

        val viewFirst =inflater.inflate(R.layout.fragment_first, container, false)
        val btnFS = viewFirst.findViewById<Button>(R.id.btnSecondFirstFragment)
        btnFS.setOnClickListener {

            val navToSF = FirstFragmentDirections.actionFirstFragmentToSecondFirstFragment()
            Navigation.findNavController(viewFirst).navigate(navToSF)
        }

        return viewFirst
    }

}