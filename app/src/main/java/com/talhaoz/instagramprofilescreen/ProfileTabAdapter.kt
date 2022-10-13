package com.talhaoz.instagramprofilescreen

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ProfileTabAdapter(activity:AppCompatActivity) : FragmentStateAdapter(activity) {

    private val TAB_COUNT = 2

    override fun getItemCount(): Int {
        return TAB_COUNT
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ActivitiesFragment()
            1 -> DetailsFragment()
            else -> throw RuntimeException("Invalid position: $position")
        }
    }
}