package com.tedm.marvelapp.data.remote.responses

data class ComicsX(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemXXXX>,
    val returned: Int
)