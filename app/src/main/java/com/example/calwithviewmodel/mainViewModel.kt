package com.example.calwithviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //creating mutableLiveData and LiveData
    private val _result = MutableLiveData<Int> (0)
    val result : LiveData<Int> = _result


    // fun calculate button
    fun addTwoNumbers(num1:Int,num2:Int) {
        _result.value = num1 + num2
    }

}