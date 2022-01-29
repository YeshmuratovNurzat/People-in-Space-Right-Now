package com.etoolkit.peopleinspacerightnow.domain.use_cases

import com.etoolkit.peopleinspacerightnow.domain.model.Astro
import com.etoolkit.peopleinspacerightnow.domain.repository.AstroRepository
import retrofit2.Response

class GetDataUseCase(private var astroRepository : AstroRepository) {

    suspend fun execute() : Response<Astro>{
        return astroRepository.getAllData()
    }
}