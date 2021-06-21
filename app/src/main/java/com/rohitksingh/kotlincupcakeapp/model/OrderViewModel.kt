package com.rohitksingh.kotlincupcakeapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    private var _quantity: MutableLiveData<Int> = MutableLiveData(0)
    val quantity : LiveData<Int> get() = _quantity

    private var _flavor : MutableLiveData<String> = MutableLiveData("")
    val flavor : LiveData<String> get() = _flavor

    private var _pickup : MutableLiveData<String> = MutableLiveData("")
    val pickup : LiveData<String> get() = _pickup

    fun setQuantity(quantity: Int){
        _quantity.value = quantity
    }

    fun setFlavor(flavor: String){
        _flavor.value = flavor
    }

    fun setPickup(pickup: String){
        _pickup.value = pickup
    }

}