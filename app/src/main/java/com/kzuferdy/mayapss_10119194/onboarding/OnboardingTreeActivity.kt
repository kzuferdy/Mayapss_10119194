package com.kzuferdy.mayapss_10119194.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.mayapss_10119194.home.HomeActivity
import com.kzuferdy.mayapss_10119194.R
import kotlinx.android.synthetic.main.activity_onboarding_tree.*

class OnboardingTreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_tree)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OnboardingTreeActivity,
                HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
