package com.kzuferdy.mayapps.home


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kzuferdy.mayapss_10119194.*
import com.kzuferdy.mayapss_10119194.onboarding.OnboardingTwoActivity
import com.kzuferdy.mayapss_10119194.utils.Preferences
import kotlinx.android.synthetic.main.fragment_setting.*

/**
 *
 *
 * A simple [Fragment] subclass.
 */
class SettingFragment : Fragment() {


    lateinit var preferences: Preferences


    override fun onCreateView(



        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        preferences = Preferences(requireContext().applicationContext)

        tv_profile.setOnClickListener {
            activity?.let{
                val intent = Intent (it, ProfileActivity::class.java)
                it.startActivity(intent)
            }
        }
        tv_contact.setOnClickListener {
            activity?.let{
                val intent = Intent (it, ContactActivity::class.java)
                it.startActivity(intent)
            }
        }
        tv_find_me.setOnClickListener {
            activity?.let{
                val intent = Intent (it, MapActivity::class.java)
                it.startActivity(intent)
            }
        }
        tv_about.setOnClickListener {
            activity?.let{
                val intent = Intent (it, DialogActivity::class.java)
                it.startActivity(intent)
            }
        }

    }


}
