package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.random_button).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        view.findViewById<Button>(R.id.toast_button).setOnClickListener {
            //create a Toast with some text and show it
            val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_LONG)
            myToast.show()
        }

        view.findViewById<Button>(R.id.count_button).setOnClickListener {
            //call a new method countMe() to interact with other views in the layout
            countMe(view)
        }
    }

    private fun countMe(view: View) {
        //Get the text view
        val showCountTextView = view.findViewById<TextView>(R.id.textview_first)
        // Get value in text view
        val countString = showCountTextView.text.toString()
        //Convert value to number and then increment it
        var count = countString.toInt()
        count++
        // Display new value in TextView
        showCountTextView.text = count.toString()
    }

}