package com.anil.shop

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.anil.shop.account.AccountFragment
import com.anil.shop.cart.CartFragment
import com.anil.shop.catalogue.CatalogueFragment
import com.anil.shop.databinding.ActivityMainBinding
import com.anil.shop.discovery.DiscoveryFragment
import com.anil.shop.wishlist.WishlistFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()

        //loading first fragment on app launch

        loadFragment("Discover", DiscoveryFragment.newInstance())

    }

    private fun loadFragment(title: String, fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()

        setTitle(title)
    }

    private fun initBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.discover -> loadFragment(
                    getString(R.string.discover), DiscoveryFragment.newInstance()
                )
                R.id.catalogue -> loadFragment(
                    getString(R.string.catalogue), CatalogueFragment.newInstance()
                )
                R.id.cart -> loadFragment(getString(R.string.cart), CartFragment.newInstance())
                R.id.wishlist -> loadFragment(
                    getString(R.string.wishlist), WishlistFragment.newInstance()
                )
                R.id.account -> loadFragment(
                    getString(R.string.account),
                    AccountFragment.newInstance()
                )

            }
            return@setOnItemSelectedListener true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_toolbar_menu, menu)

        val search = menu?.findItem(R.id.search)
        val searchView = search?.actionView as SearchView
        searchView.queryHint = "Search"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                Toast.makeText(this@MainActivity, "search query $newText", Toast.LENGTH_SHORT).show()
                return true
            }
        })

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