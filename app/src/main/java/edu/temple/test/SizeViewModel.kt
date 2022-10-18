package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SizeViewModel: ViewModel() {

    private val selectedSize : MutableLiveData<Float> by lazy {
        MutableLiveData<Float>()
    }

    fun getSize () : LiveData<Float> {
        return selectedSize
    }

    fun setSize (size: Float) {
        this.selectedSize.value = size
    }

}