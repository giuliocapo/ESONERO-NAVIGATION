package com.example.navigationb

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController



class SplashFragment : Fragment() {

    private val tutorial = "Tutorial"
    private val finish = "Finish"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment

        Handler().postDelayed({
            if(checkIfTut()){
                val navToFirst = SplashFragmentDirections.actionSplashFragmentToFirstFragment()
                findNavController().navigate(navToFirst)
            }else{
                val navToTut = SplashFragmentDirections.actionSplashFragmentToViewPagerFragment()
                findNavController().navigate(navToTut)
            }


        }, 3000)
        return inflater.inflate(R.layout.fragment_splash_, container, false)
    }

    private fun checkIfTut():Boolean{
        val sharedPref = requireActivity().getSharedPreferences(tutorial, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(finish, false)
    }


}

