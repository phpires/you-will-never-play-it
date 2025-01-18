package com.game_backlog.you_will_never_play_it

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories("com.game_backlog.you_will_never_play_it.infra.repository")
class YouWillNeverPlayItApplication

fun main(args: Array<String>) {
	runApplication<YouWillNeverPlayItApplication>(*args)
}
