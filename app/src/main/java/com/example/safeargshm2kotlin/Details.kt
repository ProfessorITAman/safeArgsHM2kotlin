package com.example.safeargshm2kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.safeargshm2kotlin.databinding.FragmentDetailsBinding

class Details : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private val args : DetailsArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        val userDetails = args.user

        binding.tvName.text = userDetails.name
        binding.tvEmail.text = userDetails.email
        binding.tvPassword.text = userDetails.password

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}