package com.example.safeargshm2kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.safeargshm2kotlin.databinding.FragmentRegistrationBinding


class Registration : Fragment() {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonSend.setOnClickListener {
            val name = binding.textName.text.toString()
            val email = binding.textEmail.text.toString()
            val password = binding.textPassword.text.toString()

            val user = User(name,email, password)

            val action = RegistrationDirections.actionRegistrationToDetails(user)

            findNavController().navigate(
                action
            )
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}