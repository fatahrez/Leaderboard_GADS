package com.fatah.leaderboard.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.fatah.leaderboard.HoursFragment
import com.fatah.leaderboard.SkillFragment

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HoursFragment()
            }
            else -> {
                SkillFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Learning Leaders"
            else -> {
                return "Skill IQ Leaders"
            }
        }
    }
}