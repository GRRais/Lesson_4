package com.example.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, BlankFragment.newInstance("1"))
                .replace(R.id.fragment_container, BlankFragment.newInstance("2"))
                .setReorderingAllowed(true)
                .addToBackStack(null)
                .commit()

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, BlankFragment.newInstance("3"))
                .setReorderingAllowed(true)
                .addToBackStack(null)
                .commit()
        }
    }

    fun fragmentsCount(): Int {
        return supportFragmentManager.fragments.size
    }

    fun backStackSize(): Int {
        return supportFragmentManager.backStackEntryCount
    }
}