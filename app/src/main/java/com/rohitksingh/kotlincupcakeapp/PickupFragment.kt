package com.rohitksingh.kotlincupcakeapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.rohitksingh.kotlincupcakeapp.databinding.FragmentPickupBinding
import com.rohitksingh.kotlincupcakeapp.model.OrderViewModel

class PickupFragment : Fragment() {

    
    private val viewmodel : OrderViewModel by activityViewModels()
    var binding : FragmentPickupBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPickupBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            viewModel = viewmodel
            pickupFragment = this@PickupFragment
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    fun navigateToSummaryFragment() {
        findNavController().navigate(R.id.action_pickupFragment_to_summaryFragment)
    }

}