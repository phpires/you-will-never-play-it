package com.game_backlog.you_will_never_play_it.domain.dto.requests

import com.game_backlog.you_will_never_play_it.infra.entity.GameEntity
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class UserCreateRequest(
    @field:NotBlank(message = "Name cannot be blank")
    val name: String,

    @field:Min(13, message = "age must be at least 13.")
    val age: Int,

    @field:NotBlank(message = "Must provide a username.")
    val userName: String,

    @field:NotBlank(message = "Must provide a password.")
    val password: String,

    @field:Email @field:NotBlank(message = "email must not be blank")
    val email: String,

    val about: String?) {

    fun toGameEntity(): GameEntity {
        return GameEntity()
    }
}