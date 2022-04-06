package br.com.murilorcm.forumsample.model

import java.time.LocalDateTime

data class Topic(
    val id: Long? = null,
    val title: String,
    val message: String,
    val creationDate: LocalDateTime = LocalDateTime.now(),
    val course: Course,
    val author: ForumUser,
    val status: TopicStatus = TopicStatus.NOT_ANSWERED,
    val answers: List<Answers> = emptyList()
)