package com.example.myapplication.util.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

object LiveDataUtils {
    fun <T, K, R> LiveData<T>.combineWith(
        liveData: LiveData<K>,
        block: (T?, K?) -> R,
    ): LiveData<R> {
        val result = MediatorLiveData<R>()
        result.addSource(this) {
            result.value = block(this.value, liveData.value)
        }
        result.addSource(liveData) {
            result.value = block(this.value, liveData.value)
        }
        return result

    }
}