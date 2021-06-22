package com.rohitksingh.kotlincupcakeapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.rohitksingh.kotlincupcakeapp.databinding.FragmentSummaryBinding
import com.rohitksingh.kotlincupcakeapp.model.OrderViewModel


class SummaryFragment : Fragment() {

    private var binding: FragmentSummaryBinding? = null
    private val viewModel: OrderViewModel by activityViewModels()
    private  val TAG = "SummaryFragment"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSummaryBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "onViewCreated: "+viewModel.pickup.value+" "+viewModel.flavor.value)
        
        binding?.apply {
            viewmodel = viewModel
            fragment = this@SummaryFragment
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}