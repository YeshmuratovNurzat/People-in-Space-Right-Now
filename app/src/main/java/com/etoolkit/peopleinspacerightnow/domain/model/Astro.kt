package com.etoolkit.peopleinspacerightnow.domain.model

data class Astro(
    val message: String,
    val number: Int,
    val people: MutableList<People>){

    class People(
        val craft: String? = null,
        val name: String? = null
    )
}