package com.example.flowproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigation

class FragmentHome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val txtHome = view.findViewById<TextView>(R.id.txtHome)

        txtHome.setOnClickListener {
//            findNavController().popBackStack(R.id.action_fragmentHome_to_fragmentLogin, true)

//            val navOptions : NavOptions = navOptions { popUpTo(R.id.fragmentHome) }


            val navOptions: NavOptions =NavOptions.Builder()
                .setPopUpTo(R.id.fragmentHome, true)
                .build()

            Navigation.findNavController(view).navigate(R.id.action_fragmentHome_to_fragmentLogin, null, navOptions);
//
//            navOptions.setPopUpTo(R.id.fragmentHome, true)


//            val amount: Float = ...
//            val action =
//                FragmentHomeDirections.actionFragmentHomeToFragmentLogin()

//            findNavController().navigate(R.id.action_fragmentHome_to_fragmentLogin, null,navOptions)

//            findNavController().navigate(R.id.action_fragmentHome_to_fragmentLogin, navOptions)

        }

        return view
    }

}