package com.game_backlog.you_will_never_play_it.domain.commands

interface InputOutputCommand<I,O> {
    fun execute(input: I) : O
}