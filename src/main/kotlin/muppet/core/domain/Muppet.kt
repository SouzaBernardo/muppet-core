package muppet.core.domain

import java.time.LocalDateTime

data class Muppet(
    val id: Long,
    val name: String,
    val image: String,
    val createdAt: LocalDateTime,
    val type: MuppetType
)