package kg.geek.kotlin1hw4.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mCounter = 0
    var historyList = MutableLiveData<ArrayList<String>>()
    val counter = MutableLiveData<Int>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
    }

    fun onPreIncrementClick() {
        mCounter--
        counter.value = mCounter
    }

    fun setHistory(symbol: ArrayList<String>) {
        historyList.value = symbol
    }
}