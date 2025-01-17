package com.game_backlog.you_will_never_play_it.infra.entity

import com.game_backlog.you_will_never_play_it.domain.objects.User
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "user")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String = "",
    val age: Int = 0,
    val bornDate: LocalDate = LocalDate.now(),
    val username: String = "",
    val password: String = "",
    val email: String = "",
    val about: String? = "",
) {
    constructor() : this(0,"",0, LocalDate.now(),"","","","") {

    }

    companion object {
        fun fromDomainClass(domainClass: User) : UserEntity {
            return UserEntity(domainClass.id, domainClass.name, domainClass.age, domainClass.bornDate, domainClass.username, domainClass.password, domainClass.email, domainClass.about)
        }
    }
}