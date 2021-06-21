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
import androidx.navigation.fragment.navArgs
import com.rohitksingh.kotlincupcakeapp.databinding.FragmentFlavorBinding
import com.rohitksingh.kotlincupcakeapp.model.OrderViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class FlavorFragment : Fragment() {

    private val viewModel : OrderViewModel by activityViewModels()
    private var binding : FragmentFlavorBinding? = null


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFlavorBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            flavorFragment = this@FlavorFragment
        }
        Toast.makeText(this.requireContext(), viewModel.quantity.value.toString() , Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    fun navigateToPickupFragment(){
        findNavController().navigate(R.id.action_flavorFragment_to_pickupFragment)
    }

}