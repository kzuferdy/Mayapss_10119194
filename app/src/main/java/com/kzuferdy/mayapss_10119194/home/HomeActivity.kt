package com.kzuferdy.mayapss_10119194.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.kzuferdy.mayapps.home.SettingFragment
import com.kzuferdy.mayapps.home.ListFragment
import com.kzuferdy.mayapss_10119194.DashboardFragment
import com.kzuferdy.mayapss_10119194.R
import kotlinx.android.synthetic.main.activity_home.*
//Nama Ferdy Mohamad Firdaus
//Nim 10119194
//Kelas IF-5
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragmentTiket = ListFragment()
        val fragmentSetting = SettingFragment()
        val fragmentHome = DashboardFragment()

        setFragment(fragmentHome)

        iv_menu1.setOnClickListener {
            setFragment(fragmentHome)

            changeIcon(iv_menu1, R.drawable.ic_home2_active)
            changeIcon(iv_menu2, R.drawable.ic_activity)
            changeIcon(iv_menu3, R.drawable.ic_profile2)
        }

        iv_menu2.setOnClickListener {
            setFragment(fragmentTiket)

            changeIcon(iv_menu1, R.drawable.ic_home2)
            changeIcon(iv_menu2, R.drawable.ic_activity_active)
            changeIcon(iv_menu3, R.drawable.ic_profile2)
        }

        iv_menu3.setOnClickListener {
            setFragment(fragmentSetting)

            changeIcon(iv_menu1, R.drawable.ic_home2)
            changeIcon(iv_menu2, R.drawable.ic_activity)
            changeIcon(iv_menu3, R.drawable.ic_profile2_active)
        }
    }

    protected fun setFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.layout_frame, fragment)
        fragmentTransaction.commit()
    }

    private fun changeIcon(imageView: ImageView, int: Int){
        imageView.setImageResource(int)
    }
}
