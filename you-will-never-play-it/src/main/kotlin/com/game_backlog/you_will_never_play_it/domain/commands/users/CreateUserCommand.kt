package com.game_backlog.you_will_never_play_it.domain.commands.users

import com.game_backlog.you_will_never_play_it.domain.commands.InputOutputCommand
import com.game_backlog.you_will_never_play_it.domain.objects.User
import com.game_backlog.you_will_never_play_it.infra.entity.UserEntity
import com.game_backlog.you_will_never_play_it.infra.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class CreateUserCommand(val repository: UserRepository) : InputOutputCommand<User, Long> {

    override fun execute(input: User): Long {
        val createdUser = this.repository.save(UserEntity.fromDomainClass(input))
        var createId = 0L
    }
}