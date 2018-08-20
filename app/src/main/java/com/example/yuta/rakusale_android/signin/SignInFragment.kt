package com.example.yuta.rakusale_android.signin

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.yuta.rakusale_android.MainActivity
import com.example.yuta.rakusale_android.R


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [Log_inFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [Log_inFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class SignInFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val buttonCreateAnAccount: Button = view.findViewById(R.id.create_an_account)

        val loginButton = view.findViewById<Button>(R.id.login)


        //loginButtonを押した時の処理
        loginButton.setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        //buttonが押された時の処理
        buttonCreateAnAccount.setOnClickListener {
            fragmentManager?.run {
                this.beginTransaction().replace(R.id.login_fragment_container, SignUpFragment()).commit()
            }
        }

        return view
    }

}
