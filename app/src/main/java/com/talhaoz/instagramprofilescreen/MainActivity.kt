package com.talhaoz.instagramprofilescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.talhaoz.instagramprofilescreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        initTabLayout()

        with(binding) {
            // TODO replace dummy data with real one
            layoutPost.tvActionTitle.text = ACTIONS.POST.displayName
            layoutPost.tvActionNumber.text = "7"
            layoutFollower.tvActionTitle.text = ACTIONS.FOLLOWER.displayName
            layoutFollower.tvActionNumber.text = "250+"
            layoutConnection.tvActionTitle.text = ACTIONS.CONNECTION.displayName
            layoutConnection.tvActionNumber.text = "1000+"
        }
    }

    private fun initTabLayout() {
        val tabLayoutMediator =
            TabLayoutMediator(binding.tlProfile, binding.vpProfile) { tab, position ->
                when (position) {
                    0 -> tab.text = TAB.ACTIVITIES.displayName
                    1 -> tab.text = TAB.DETAILS.displayName
                }
            }
        binding.vpProfile.adapter = ProfileTabAdapter(this as AppCompatActivity)
        tabLayoutMediator.attach()
    }
}

enum class TAB(val displayName: String) {
    ACTIVITIES("Activities"),
    DETAILS("Details")
}

enum class ACTIONS(val displayName: String) {
    POST("Post"),
    FOLLOWER("Follower"),
    CONNECTION("Connection")
}
