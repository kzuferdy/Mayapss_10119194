package com.kzuferdy.mayapss_10119194

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import com.kzuferdy.mayapss_10119194.home.HomeActivity
import com.kzuferdy.mayapss_10119194.R
import kotlinx.android.synthetic.main.activity_onboarding_tree.*

class DialogActivity : AppCompatActivity() {

    private lateinit var btnDialog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)

        btnDialog = findViewById<Button>(R.id.tv_about)
        btnDialog.setOnClickListener {
        customDialog()
        }
    }
    private fun customDialog(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog)


        val btnTutup = dialog.findViewById<Button>(R.id.btn_tutup)
        btnTutup.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}