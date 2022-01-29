package com.etoolkit.peopleinspacerightnow.data

import com.etoolkit.peopleinspacerightnow.domain.model.Astro
import com.etoolkit.peopleinspacerightnow.domain.repository.AstroRepository
import retrofit2.Call
import retrofit2.Response

class AstroRepositoryImpl : AstroRepository {

    override suspend fun getAllData() : Response<Astro> {
        return RetrofitInstance.create().getPeopleInSpace()
    }
}