package com.anil.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.anil.shop.databinding.ActivityMainBinding
import com.anil.shop.databinding.DiscoveryFragmentBinding
import com.anil.shop.discovery.DiscoveryFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()

        loadFragment("Discover", DiscoveryFragment.newInstance())
    }

    private fun loadFragment(discover: String, fragment: Fragment) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

        setTitle(discover)
    }

    private fun initBottomNavigation() {
        binding.bottomNavigation.setOnClickListener {
            when(it.id) {
                R.id.discover -> loadFragment("Discover", DiscoveryFragment.newInstance())
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.search) {
            // do something
        } else if (item.itemId == R.id.cart) {
            // do something
        }
        return false
    }
}