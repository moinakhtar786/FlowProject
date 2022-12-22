package com.example.flowproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class FragmentLogin : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val txtLogin = view.findViewById<TextView>(R.id.txtLogin)

        txtLogin.setOnClickListener{

//            val navController= it.findNavController()

//            navController.previousBackStackEntry?.let { backEntry -> navController.popBackStack(backEntry.destination.id,true) }


//            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentSignUp)

            val navOptions: NavOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentLogin, true)
                .build()

            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentSignUp, null, navOptions);



        }

        return view
    }


}