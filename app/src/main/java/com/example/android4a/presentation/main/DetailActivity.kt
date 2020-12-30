package com.example.android4a.presentation.main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android4a.R
import com.example.android4a.domain.entity.User
import org.koin.android.ext.android.inject

class DetailActivity : AppCompatActivity(){

    val detailViewModel : DetailViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val user = intent.getSerializableExtra("key") as User

        findViewById<TextView>(R.id.textView).apply {
            val texte: String = "email:"+user.email + " - password:" + user.password + " - nom:" + user.nom + " - prenom:" + user.prenom
            text = texte
        }
    }
}
