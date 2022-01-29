package com.etoolkit.peopleinspacerightnow.domain.repository

import com.etoolkit.peopleinspacerightnow.domain.model.Astro
import retrofit2.Call
import retrofit2.Response

interface AstroRepository {

  suspend fun getAllData() : Response<Astro>

}