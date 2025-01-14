package com.game_backlog.you_will_never_play_it.domain.objects

import java.time.LocalDate

class Game {
    private var id: Long? = null
    private var title: String? = null
    private var genre: String? = null
    private var developer: String? = null
    private var launchDate: LocalDate? = null
}
