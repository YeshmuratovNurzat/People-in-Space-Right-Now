package com.etoolkit.peopleinspacerightnow.data


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

     companion object {
        var base_url = "http://api.open-notify.org/"

        fun create(): AstroApi {
            val retrofit = Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(AstroApi::class.java)
        }
    }
}

