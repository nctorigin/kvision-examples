package com.example

import kotlinx.serialization.Serializable
import pl.treksoft.kvision.types.KDate

@Serializable
data class Address(
    val id: Int? = 0,
    val firstName: String? = null,
    val lastName: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val postalAddress: String? = null,
    val favourite: Boolean? = false,
    val createdAt: KDate? = null,
    val userId: String? = null
)
