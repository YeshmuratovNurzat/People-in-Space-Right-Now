package com.etoolkit.peopleinspacerightnow.presentation.view_model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.etoolkit.peopleinspacerightnow.domain.model.Astro
import com.etoolkit.peopleinspacerightnow.domain.use_cases.GetDataUseCase
import kotlinx.coroutines.launch
import retrofit2.Response

class AstroViewModel(private var getDataUseCase: GetDataUseCase) : ViewModel() {

    init {
        Log.e("My","View Model created")
    }

    override fun onCleared() {
        Log.e("My","View Model cleared")
        super.onCleared()
    }

    var listData : MutableLiveData<Response<Astro>> = MutableLiveData()

    fun getAllData() {
        viewModelScope.launch {
            listData.value = getDataUseCase.execute()
        }
    }
}