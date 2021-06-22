package com.rohitksingh.kotlincupcakeapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class OrderViewModel : ViewModel() {

    private var _quantity: MutableLiveData<Int> = MutableLiveData(0)
    val quantity : LiveData<Int> get() = _quantity

    private var _flavor : MutableLiveData<String> = MutableLiveData("")
    val flavor : LiveData<String> get() = _flavor

    private var _pickup : MutableLiveData<String> = MutableLiveData("")
    val pickup : LiveData<String> get() = _pickup

    val pickupDates : List<String> get() = getPickupOptions()

    fun setQuantity(quantity: Int){
        _quantity.value = quantity
    }

    fun setFlavor(flavor: String){
        _flavor.value = flavor
    }

    fun setPickup(pickup: String){
        _pickup.value = pickup
    }

    private fun getPickupOptions(): List<String> {
        val options = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        // Create a list of dates starting with the current date and the following 3 dates
        repeat(4) {
            options.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return options
    }

}