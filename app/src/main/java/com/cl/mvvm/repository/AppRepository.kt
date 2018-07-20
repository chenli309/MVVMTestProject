package com.cl.mvvm.repository

import android.arch.lifecycle.MutableLiveData


class AppRepository {
    private var newsLiveData: MutableLiveData<String> = MutableLiveData()

    fun getNews() {
        newsLiveData.value = null
    }

//    fun getProjectList(userId: String): LiveData<List<Project>> {
//        val data = MutableLiveData<List<Project>>()
//        gitHubService.getProjectList(userId).enqueue(object : Callback<List<Project>>() {
//            fun onResponse(call: Call<List<Project>>, response: Response<List<Project>>) {
//                data.setValue(response.body())
//            }
//
//            fun onFailure(call: Call<List<Project>>, t: Throwable) {
//                // TODO better error handling in part #2 ...
//                data.setValue(null)
//            }
//        })
//        return data
//    }

}