package com.kzuferdy.mayapss_10119194

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.kzuferdy.mayapps.DetailActivity
import com.kzuferdy.mayapps.home.dashboard.ComingSoonAdapter
import com.kzuferdy.mayapps.home.dashboard.NowPlayingAdapter
import com.kzuferdy.mayapss_10119194.model.Film
import kotlinx.android.synthetic.main.fragment_dashboard.*
import java.text.NumberFormat
import java.util.*
import com.kzuferdy.mayapss_10119194.utils.Preferences
import kotlin.collections.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {

    private lateinit var preferences: Preferences
    private lateinit var mDatabase : DatabaseReference

    private var dataList = ArrayList<Film>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }


    @Suppress("DEPRECATION")
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        preferences = Preferences(activity!!.applicationContext)
        mDatabase = FirebaseDatabase.getInstance("https://myapss-f0121-default-rtdb.firebaseio.com/").getReference("Film")



        rv_now_playing.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rv_coming_soon.layoutManager = LinearLayoutManager(context)

        getData()

    }

    private fun getData() {
       mDatabase.addValueEventListener(object : ValueEventListener {

           override fun onCancelled(databaseError: DatabaseError) {
              Toast.makeText(context, ""+databaseError.message, Toast.LENGTH_LONG).show()
           }

           override fun onDataChange(dataSnapshot: DataSnapshot) {

               dataList.clear()
               for (getdataSnapshot in dataSnapshot.children){
                   var film = getdataSnapshot.getValue(Film::class.java)
                   dataList.add(film!!)

               }
               rv_now_playing.adapter = NowPlayingAdapter(dataList) {
                         var intent = Intent(context, DetailActivity::class.java).putExtra("data", it)
                   startActivity(intent)
               }
              rv_coming_soon.adapter = ComingSoonAdapter(dataList) {
                        var intent = Intent(context, DetailActivity::class.java).putExtra("data", it)
                  startActivity(intent)
             }

           }



       })
    }

    private fun currency(harga : Double, textview : TextView){
        val localIDN = Locale("in", "ID")
        val format = NumberFormat.getCurrencyInstance(localIDN)
        textview.setText(format.format(harga))
    }
}