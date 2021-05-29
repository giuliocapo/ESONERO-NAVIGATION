package com.example.navigationb.viewPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.navigationb.R
import com.example.navigationb.viewPager.screens.FirstScreen
import com.example.navigationb.viewPager.screens.SecondScreen
import com.example.navigationb.viewPager.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val viewPF = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmenList = arrayListOf<Fragment>( FirstScreen(), SecondScreen(), ThirdScreen() )

        val adapter = ViewPagerAdapter(fragmenList, requireActivity().supportFragmentManager, lifecycle) as PagerAdapter

        viewPF.findViewById<ViewPager>(R.id.viewPager).adapter = adapter

        //minuto 6:56 di Stevdza

        return viewPF
    }

}