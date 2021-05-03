package com.tedm.marvelapp.data.remote.responses

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)