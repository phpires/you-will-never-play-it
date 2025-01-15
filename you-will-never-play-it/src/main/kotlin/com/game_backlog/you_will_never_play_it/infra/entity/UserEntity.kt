package com.game_backlog.you_will_never_play_it.infra.entity

import com.game_backlog.you_will_never_play_it.domain.objects.User
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "user")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String? = null,
    val age: Int? = null,
    val bornDate: LocalDate? = null,
    val username: String? = null,
    val password: String? = null,
    val email: String? = null,
    val about: String? = null,
) {
    companion object {
        fun fromDomainClass(domainClass: User) : UserEntity {
            return UserEntity(domainClass.id, domainClass.name, domainClass.age, domainClass.bornDateTime, domainClass.username, domainClass.about)
        }
    }
}