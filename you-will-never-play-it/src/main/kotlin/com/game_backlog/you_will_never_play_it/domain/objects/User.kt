package com.game_backlog.you_will_never_play_it.domain.objects

import java.time.LocalDate

class User {
    var id: Long? = null
    var name: String? = null
    var age: Int? = null
    var bornDateTime: LocalDate? = null
    var username: String? = null
    var password: String? = null
    var email: String? = null
    var about: String? = null
}
