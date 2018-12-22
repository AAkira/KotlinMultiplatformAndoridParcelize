package com.github.aakira.kotlinnativesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.github.aakira.kotlinnativesample.common.model.User

class MainActivity : AppCompatActivity() {

    val user = User(100, "AAkira", "hoge@gmail.com")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = user.name
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("user", user)
    }
}
