package com.example.phonebook.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.phonebook.databinding.FragmentPhonebookitemBinding

class PhonebookitemFragment : Fragment() {

    private lateinit var binding : FragmentPhonebookitemBinding
    private var contact_name : String = ""
    private var contact_number : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            contact_name = it.getString("contact_name").toString()
            contact_number = it.getString("contact_number").toString()
        }

    }

}
