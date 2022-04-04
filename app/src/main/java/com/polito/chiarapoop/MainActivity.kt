package com.polito.chiarapoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment
    private lateinit var achievementFragment: AchievementFragment
    private lateinit var leaderboardFragment: LeaderboardFragment
    private lateinit var profileFragment: ProfileFragment
    private var activeFragment: Fragment? = null

    companion object {
        private const val ACTIVE_FRAGMENT_KEY = "active_fragment_key"
        private const val HOME_FRAGMENT_TAG = "home_fragment_tag"
        private const val ACHIEVEMENT_FRAGMENT_TAG = "achievement_fragment_tag"
        private const val LEADERBOARD_FRAGMENT_TAG = "leaderboard_fragment_tag"
        private const val PROFILE_FRAGMENT_TAG = "profile_fragment_tag"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun initFragments() {
        homeFragment = HomeFragment()
        achievementFragment = AchievementFragment()
        leaderboardFragment = LeaderboardFragment()
        profileFragment = ProfileFragment()
        activeFragment = homeFragment
        supportFragmentManager.beginTransaction()
            .add(R.id.home_fragmentContainerView, profileFragment, PROFILE_FRAGMENT_TAG)
            .add(R.id.home_fragmentContainerView, leaderboardFragment, LEADERBOARD_FRAGMENT_TAG)
            .add(R.id.home_fragmentContainerView, achievementFragment, ACHIEVEMENT_FRAGMENT_TAG)
            .add(R.id.home_fragmentContainerView, homeFragment, HOME_FRAGMENT_TAG)
            .hide(profileFragment).hide(leaderboardFragment).hide(achievementFragment).commit()
    }
}