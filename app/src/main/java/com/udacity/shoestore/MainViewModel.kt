package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>(listOf(Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe")))
    val shoes: LiveData<List<Shoe>> = _shoes

}