package com.game_backlog.you_will_never_play_it.infra.entity

import com.game_backlog.you_will_never_play_it.domain.objects.Game
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "game")
data class GameEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val title: String,
        val genre: String,
        val developer: String,
        val launchDate: LocalDate) {
        constructor() : this(0, "", "", "", LocalDate.now()) {

        }

}