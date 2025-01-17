package com.game_backlog.you_will_never_play_it.domain.commands.games

import com.game_backlog.you_will_never_play_it.domain.commands.InputOutputCommand
import com.game_backlog.you_will_never_play_it.domain.objects.Game

class CreateGameCommand : InputOutputCommand<Game, Long> {
    override fun execute(input: Game): Long {
        TODO("Not yet implemented")
    }
}