package com.game_backlog.you_will_never_play_it.infra.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "user")
data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val id: Long? = null,
        private val name: String? = null,
        private val bornDateTime: LocalDate? = null,
        private val username: String? = null,
        private val password: String? = null,
        private val email: String? = null,
        private val about: String? = null,
)