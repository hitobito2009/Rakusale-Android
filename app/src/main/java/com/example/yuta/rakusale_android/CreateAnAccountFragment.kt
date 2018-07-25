package com.example.yuta.rakusale_android

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [Create_an_AccountFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [Create_an_AccountFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */

class CreateAnAccountFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_create_an_account, container, false)

        val button_create: Button = view.findViewById(R.id.create)

        //buttonが押された時の処理
        button_create.setOnClickListener {
            fragmentManager?.run {
                this.beginTransaction().replace(R.id.login_fragment_container, LoginFragment()).commit()
            }
        }

        return view
    }



}
