package com.rohitksingh.kotlincupcakeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.rohitksingh.kotlincupcakeapp.model.OrderViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PickupFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PickupFragment : Fragment() {

    val viewModel : OrderViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(this.requireContext(), viewModel.quantity.value.toString() + viewModel.flavor.value, Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_pickup, container, false)
    }

    fun navigateToSummaryFragment() {

    }
}