package com.example.petzzu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.button.MaterialButton

class Dashboard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val secondActbutton=findViewById<ImageView>(R.id.remind)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this,LocalNotification::class.java)
            startActivity(Intent)
        }

        val trac=findViewById<ImageView>(R.id.tracking)
        trac.setOnClickListener {
            val Intent = Intent(this,Medication::class.java)
            startActivity(Intent)
        }
        val petf=findViewById<ImageView>(R.id.petfolio)
        petf.setOnClickListener{
            val Intent=Intent(this,Petfolio::class.java)
            startActivity(Intent)
        }

        val communityy=findViewById<ImageView>(R.id.community)
        communityy.setOnClickListener{
            val Intent=Intent(this,PetCommunity::class.java)
            startActivity(Intent)
        }

        val emergencyy=findViewById<ImageView>(R.id.emergency)
        emergencyy.setOnClickListener{
            val Intent=Intent(this,EmergencyContacts::class.java)
            startActivity(Intent)
        }
        val chatbott=findViewById<ImageView>(R.id.chatbot)
        chatbott.setOnClickListener{
            val Intent=Intent(this,ChatBot::class.java)
            startActivity(Intent)
        }
    }
}