package co.za.appbrewery.notify.ui.activities.community

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.za.appbrewery.notify.R

class ComDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_details)

        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "My Alert".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)
    }

    //back button function
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}