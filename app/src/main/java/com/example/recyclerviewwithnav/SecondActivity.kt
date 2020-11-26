package com.example.recyclerviewwithnav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.recyclerviewwithnav.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_second)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.secondActivityTitle = "This is the second activity"

        val firstFragment = A2FragmentOne()
        val secondFragment = A2FragmentTwo()
        val thirdFragment = A2FragmentThree()

        makeCurrentFragment(firstFragment)

        val bottomNav = binding.bottomNavigation
        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_item1 -> makeCurrentFragment(firstFragment)
                R.id.nav_item2 -> makeCurrentFragment(secondFragment)
                R.id.nav_item3 -> makeCurrentFragment(thirdFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{
            replace(binding.fragmentContainer.id, fragment)
            commit()
        }
}