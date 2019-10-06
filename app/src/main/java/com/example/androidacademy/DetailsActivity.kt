package com.example.androidacademy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }

    fun goToTrailer(view: View) {
        val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TcMBFSGVi1c"))
        startActivity(intent)
    }
}
