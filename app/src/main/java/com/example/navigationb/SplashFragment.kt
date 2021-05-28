package com.example.navigationb

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController



class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment

        Handler().postDelayed({
            findNavController().navigate(R.id.action_splash_Fragment_to_firstFragment)

        }, 1000)
        return inflater.inflate(R.layout.fragment_splash_, container, false)
    }

}

