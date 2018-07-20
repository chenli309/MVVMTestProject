package com.cl.mvvm.vm

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

class NewsViewModel : ViewModel() {

    lateinit var newsLiveData: LiveData<List<String>>

}