package com.etoolkit.peopleinspacerightnow.data

import com.etoolkit.peopleinspacerightnow.domain.model.Astro
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface AstroApi {

    @GET("/astros/v1")
    suspend fun getPeopleInSpace() : Response<Astro>

}