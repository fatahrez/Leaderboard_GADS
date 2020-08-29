package com.fatah.leaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fatah.leaderboard.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_leaderboard.*

class LeaderboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)

        val fragmentAdapter = ViewPagerAdapter(supportFragmentManager)
        view_pager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(view_pager)
    }
}