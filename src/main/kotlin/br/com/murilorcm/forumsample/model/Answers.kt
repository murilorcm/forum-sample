package br.com.murilorcm.forumsample.model

import java.time.LocalDateTime

data class Answers(
    val id: Long? = null,
    val message: String,
    val creationDate: LocalDateTime? = LocalDateTime.now(),
    val author: ForumUser,
    val topic: Topic,
    val isAnswerSolution: Boolean = false
)