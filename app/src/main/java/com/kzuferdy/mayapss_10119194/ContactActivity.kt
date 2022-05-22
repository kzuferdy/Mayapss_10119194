package com.kzuferdy.mayapss_10119194

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.BLUE
import android.hardware.camera2.params.RggbChannelVector.BLUE
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val textPrivacy : TextView = findViewById(R.id.tv_fb)
        textPrivacy.movementMethod = LinkMovementMethod.getInstance()
        textPrivacy.setLinkTextColor(Color.BLUE)

    }

}