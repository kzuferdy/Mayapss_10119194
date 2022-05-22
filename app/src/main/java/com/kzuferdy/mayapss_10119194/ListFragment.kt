package com.kzuferdy.mayapps.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.kzuferdy.mayapss_10119194.R
import com.kzuferdy.mayapss_10119194.model.Film
import com.kzuferdy.mayapss_10119194.utils.Preferences
import com.google.firebase.database.*
import com.kzuferdy.mayapss_10119194.model.Friend
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


}
