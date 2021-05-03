package com.tedm.marvelapp.data.remote.responses

data class Events(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemX>,
    val returned: Int
)