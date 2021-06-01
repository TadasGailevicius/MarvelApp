package com.tedm.marvelapp.data.remote.responses

data class DataX(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<ResultX>,
    val total: Int
)