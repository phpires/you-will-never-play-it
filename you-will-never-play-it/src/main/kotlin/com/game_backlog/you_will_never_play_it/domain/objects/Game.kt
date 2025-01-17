package com.game_backlog.you_will_never_play_it.domain.objects

import java.time.LocalDate

class Game {
    var id: Long = 0
    var title: String = ""
    var genre: List<String> = emptyList()
    var developer: String = ""
    var launchDate: LocalDate = LocalDate.now()
}
