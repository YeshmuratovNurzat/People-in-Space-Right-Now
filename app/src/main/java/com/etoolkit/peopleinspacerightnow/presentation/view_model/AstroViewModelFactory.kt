package com.etoolkit.peopleinspacerightnow.presentation.view_model


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.etoolkit.peopleinspacerightnow.data.AstroRepositoryImpl
import com.etoolkit.peopleinspacerightnow.domain.use_cases.GetDataUseCase

class AstroViewModelFactory() : ViewModelProvider.Factory {

    private val astroRepository by lazy { AstroRepositoryImpl() }
    private val getDataUseCase by lazy { GetDataUseCase(astroRepository) }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AstroViewModel(getDataUseCase) as T
    }
}