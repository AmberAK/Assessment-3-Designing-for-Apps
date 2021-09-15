package co.za.appbrewery.notify

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import co.za.appbrewery.notify.databinding.ActivityMainBinding
import co.za.appbrewery.notify.ui.activities.community.ComListActivity
import co.za.appbrewery.notify.ui.activities.emergency.EmergListActivity
import co.za.appbrewery.notify.ui.activities.missing.MissListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //hooks
        val btnComm = findViewById<Button>(R.id.btnCommunity)
        val btnEmg = findViewById<Button>(R.id.btnEmergency)
        val btnMissing = findViewById<Button>(R.id.btnMissing)


        btnComm.setOnClickListener {
          val intent = Intent(this, ComListActivity::class.java)
            startActivity(intent)
            }


        btnEmg.setOnClickListener {
            val intent = Intent( this, EmergListActivity::class.java)
            startActivity(intent)

        }
        btnMissing.setOnClickListener {
            val intent = Intent(this, MissListActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}