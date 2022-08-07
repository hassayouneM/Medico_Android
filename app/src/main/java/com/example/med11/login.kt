package com.example.med11

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.med11.AcceuilPatient.Acceuil_patient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [login.newInstance] factory method to
 * create an instance of this fragment.
 */


const val PREF_NAME = "LOGIN_PREF_medico"
const val LOGIN = "USER_NAME"
const val PASSWORD = "PASSWORD"
const val IS_REMEMBRED = "IS_REMEMBRED"

class login : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    lateinit var btnLogin: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_login, container, false)

        var btnLogin=view.findViewById<Button>(R.id.btn_login_frag_login)
        var userName=view.findViewById<TextView>(R.id.userName_input)
        var password=view.findViewById<TextView>(R.id.editTextPassword)



        btnLogin.setOnClickListener{

            val intent = Intent (getActivity(), Acceuil_patient::class.java)
            getActivity()?.startActivity(intent)
        }
        return view
    }



}