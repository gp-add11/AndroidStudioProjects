package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

// Adding import for navArgs
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        //get count argument. type is integer, same as myArg
        val count = args.myArg
        //get the string of the count and format it with count
        val countText = getString(R.string.hello_second_fragment, count)
        //set formatted string to textview_header
        view.findViewById<TextView>(R.id.textview_header).text = countText

        //Get random number between 0 and count
        val random = java.util.Random()
        var randomNumber = 0
        if (count>0){
            randomNumber = random.nextInt(count+1)
        }

        view.findViewById<TextView>(R.id.textview_random).text = randomNumber.toString()

    }
}