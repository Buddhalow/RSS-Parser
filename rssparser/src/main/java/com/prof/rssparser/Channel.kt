package com.prof.rssparser

data class Channel(
        val title: String? = null,
        val link: String? = null,
        val description: String? = null,
        val articles: MutableList<Article> = mutableListOf()
)