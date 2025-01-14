package com.game_backlog.you_will_never_play_it.domain.dto.requests

import com.game_backlog.you_will_never_play_it.infra.entity.GameEntity
import java.time.LocalDate

data class UserCreateRequest(val name: String?,
                             val bornDate: LocalDate,
                             val userName: String,
                             val password: String,
                             @Email
                             val email: String,
                             val about: String?) {

    fun toGameEntity(): GameEntity {
        return GameEntity()
    }
}