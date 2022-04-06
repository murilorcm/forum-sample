package br.com.murilorcm.forumsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForumSampleApplication

fun main(args: Array<String>) {
	runApplication<ForumSampleApplication>(*args)
}
