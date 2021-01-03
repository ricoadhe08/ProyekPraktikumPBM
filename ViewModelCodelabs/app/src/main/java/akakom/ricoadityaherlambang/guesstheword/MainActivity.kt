package akakom.ricoadityaherlambang.guesstheword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import akakom.ricoadityaherlambang.guesstheword.R

/**
 * Creates an Activity that hosts all of the fragments in the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

}
