package com.example.kurush_frontend.matching

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kurush_frontend.R
import com.example.kurush_frontend.databinding.FragmentMatchingMainBinding

class MatchingStudyFragment : Fragment() {
    lateinit var binding: FragmentMatchingMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMatchingMainBinding.inflate(inflater, container,false)

        return binding.root
    }
}