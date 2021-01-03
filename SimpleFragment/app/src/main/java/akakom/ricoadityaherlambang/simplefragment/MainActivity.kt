package akakom.ricoadityaherlambang.simplefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import akakom.ricoadityaherlambang.simplefragment.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Modul 5 - SimpleFragment"
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(
            R.id.frameLayout,
            SampleFragment()
        ).commit()
    }
    fun fragmentMethod() {
        Toast.makeText(this@MainActivity, "Method called From Fragment",
            Toast.LENGTH_LONG).show()
    }
}