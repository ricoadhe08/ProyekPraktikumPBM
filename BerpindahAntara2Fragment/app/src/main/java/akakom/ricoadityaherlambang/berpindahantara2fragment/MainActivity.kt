package akakom.ricoadityaherlambang.berpindahantara2fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import akakom.ricoadityaherlambang.berpindahantara2fragment.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager!!.
        beginTransaction().
        add(
            R.id.fragmentContainer,
            FragmentOne(),"FragmentOne").commit()
    }
}