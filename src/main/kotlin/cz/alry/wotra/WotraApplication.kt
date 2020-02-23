package cz.alry.wotra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WotraApplication

fun main(args: Array<String>) {
	runApplication<WotraApplication>(*args)
}
