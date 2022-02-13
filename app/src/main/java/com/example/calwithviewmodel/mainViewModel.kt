package com.example.calwithviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainViewModel : ViewModel() {
    private val _result = MutableLiveData<Int> (0)
    val result : LiveData<Int> = _result
    

}