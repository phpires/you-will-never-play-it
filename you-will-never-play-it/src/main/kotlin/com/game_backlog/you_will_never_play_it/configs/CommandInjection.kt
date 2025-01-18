package com.game_backlog.you_will_never_play_it.configs

import com.game_backlog.you_will_never_play_it.domain.commands.users.CreateUserCommand
import com.game_backlog.you_will_never_play_it.infra.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
class CommandInjection {

//    @Autowired
//    private lateinit var userRepository: UserRepository

//    @Bean
//    fun createUserCommand() : CreateUserCommand {
//        return CreateUserCommand(this.userRepository)
//    }
}