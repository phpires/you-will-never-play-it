package com.game_backlog.you_will_never_play_it.resources

import com.game_backlog.you_will_never_play_it.domain.dto.requests.UserCreateRequest
import com.game_backlog.you_will_never_play_it.domain.service.UserService
import jakarta.validation.Valid
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(val userService: UserService) {

    @PostMapping
    fun create(@Valid @RequestBody createRequest: UserCreateRequest): String {
        userCommand.execute(createRequest.toGameEntity());
        return "User request received: $createRequest"
    }
}