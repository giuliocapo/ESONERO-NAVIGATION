package com.example.navigationb


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible
import androidx.navigation.Navigation
import com.example.navigationb.MainActivity.Companion.binding


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


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