package com.kzuferdy.mayapss_10119194

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.mayapps.home.SettingFragment
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        iv_back.setOnClickListener {
            var intent = Intent(this@ProfileActivity, SettingFragment::class.java)
            startActivity(intent)
        }

    }
}