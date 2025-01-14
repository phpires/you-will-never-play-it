package com.game_backlog.you_will_never_play_it.infra.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "game")
data class GameEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val id: Long? = null,
        private val title: String? = null,
        private val genre: String? = null,
        private val developer: String? = null,
        private val launchDate: LocalDate? = null)