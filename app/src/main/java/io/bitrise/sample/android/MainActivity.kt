package io.bitrise.sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val someStringToken = "MySecretStringTokenThatMustBeHiddenAndNotAvailableToAnybody"
        Log.d("TAG", someStringToken)
    }
}
