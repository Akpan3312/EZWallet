package com.example.ezwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)
        if (savedInstanceState==null){
            LoadFragment(profileFragment())
        }
    }
    private fun LoadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(androidx.fragment.R.id.fragment_container,fragment)
            .commit()
    }

    class LoadFragment(profileFragment: profileFragment) {

    }
}