package com.game_backlog.you_will_never_play_it.domain.objects

import java.time.LocalDate

class User(
    var id: Long = 0,
    var name: String = "",
    var age: Int = 0,
    var bornDate: LocalDate,
    var username: String = "",
    var password: String = "",
    var email: String = "",
    var about: String? = ""
)
