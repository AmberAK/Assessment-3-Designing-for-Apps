package co.za.appbrewery.notify.ui.activities.community

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.za.appbrewery.notify.R
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class ComCreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_create)

        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "Create Alert".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

        //hooks
        val btnSave = findViewById<ExtendedFloatingActionButton>(R.id.fabAddCommunity)
        btnSave.setOnClickListener {
            val intent = Intent(this,ComComfirmActivity::class.java)
            startActivity(intent)
        }
    }


    //back button function
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}