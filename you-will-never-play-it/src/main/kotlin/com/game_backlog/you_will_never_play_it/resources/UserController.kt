package com.game_backlog.you_will_never_play_it.resources

import com.game_backlog.you_will_never_play_it.domain.commands.users.CreateUserCommand
import com.game_backlog.you_will_never_play_it.domain.objects.User
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/users")
class UserController(val createUserCommand: CreateUserCommand) {

    @PostMapping
    fun create(@Valid @RequestBody createRequest: User): ResponseEntity<String> {
        val createdId = createUserCommand.execute(createRequest)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("User created with ID: $createdId")
    }
}