package com.game_backlog.you_will_never_play_it.infra.repository

import com.game_backlog.you_will_never_play_it.infra.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long> {
}