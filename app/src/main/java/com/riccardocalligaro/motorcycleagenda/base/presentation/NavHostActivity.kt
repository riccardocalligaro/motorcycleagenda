package com.riccardocalligaro.motorcycleagenda.base.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.riccardocalligaro.motorcycleagenda.R
import kotlinx.android.synthetic.main.nav_host_activity.*

class NavHostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_host_activity)
        // set up navigation (action bar and bottom nav bar)
        setupNavigation()
    }

    private fun setupNavigation() {
        val navController = nav_host_fragment.findNavController()
        bottom_nav_view.setupWithNavController(navController)
    }
}
