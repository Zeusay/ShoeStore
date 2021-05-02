package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import timber.log.Timber
import kotlin.time.TimedValue

class MainViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>(
        mutableListOf(
        Shoe("Air Jordan", 6.0, "Nike", "Michael Jordan's Finest Shoe")
    )
    )

    val shoes: LiveData<List<Shoe>> = _shoes

    fun addShoe (shoe: Shoe){

        //_shoes.value = _shoes.value!! + shoe

        Timber.v("Shoe Added")

        val oldList = _shoes.value
        val newList = mutableListOf<Shoe>()
        if (oldList != null) {
            newList.addAll(oldList)
        }
        newList.add(shoe)
        _shoes.value = newList

        Timber.v("Shoes list $shoes")

    }

}