package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>(listOf(
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Joran", 5.0, "Nike3", "Michaael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe"),
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe")
    ))

    val shoes: LiveData<List<Shoe>> = _shoes

//TODO: SAVE SHOE FUNC

}