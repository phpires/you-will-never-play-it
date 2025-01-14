package com.game_backlog.you_will_never_play_it.domain.objects

import java.time.LocalDate

class User {
    private var id: Long? = null
    private var name: String? = null
    private var bornDateTime: LocalDate? = null
    private var username: String? = null
    private var password: String? = null
    private var email: String? = null
    private var about: String? = null
}
