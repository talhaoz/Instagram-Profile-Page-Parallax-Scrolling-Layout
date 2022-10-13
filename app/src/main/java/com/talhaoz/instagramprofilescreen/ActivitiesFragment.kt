package com.talhaoz.instagramprofilescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.talhaoz.instagramprofilescreen.databinding.FragmentActivitiesBinding


class ActivitiesFragment : Fragment() {

    private var _binding: FragmentActivitiesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentActivitiesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvUserActivities.layoutManager = LinearLayoutManager(requireContext())
        binding.rvUserActivities.adapter = ActivitiesAdapter(getPostList())
    }

    private fun getPostList() : ArrayList<String> {
        return arrayListOf(
            "Lorem Ipsum",
            "Dolor sit amet",
            "consectetur adipiscing elit",
            "sed do eiusmod",
            "tempor incididunt",
            "ut labore et dolore"
        )
    }

}