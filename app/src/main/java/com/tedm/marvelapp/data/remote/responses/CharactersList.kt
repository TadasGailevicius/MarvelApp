package com.tedm.marvelapp.data.remote.responses

data class CharactersList(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: DataX,
    val etag: String,
    val status: String
)