package com.prof.rssparser

data class Season(
    var number : Int = 0,
    var name : String? = null,
    val articles: MutableList<Article> = mutableListOf()
)
