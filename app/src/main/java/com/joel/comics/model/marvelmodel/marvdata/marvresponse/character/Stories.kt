package com.joel.comics.model.marvelmodel.marvdata.marvresponse.character

data class Stories(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemXXX>,
    val returned: Int
)