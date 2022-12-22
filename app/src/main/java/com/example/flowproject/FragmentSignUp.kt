package com.example.flowproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class FragmentSignUp : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        val txtSignUp = view.findViewById<TextView>(R.id.txtSignUp)

        txtSignUp.setOnClickListener{
//            findNavController().popBackStack(R.id.fragmentLogin, true)
//            findNavController().navigate(R.id.action_fragmentSignUp_to_fragmentHome)

            val navOptions: NavOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignUp, true)
                .build()

            Navigation.findNavController(view).navigate(R.id.action_fragmentSignUp_to_fragmentHome, null, navOptions);
        }

        return view
    }


}