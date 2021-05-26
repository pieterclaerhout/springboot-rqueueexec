package be.yellowduck.springboot.rqueueexec

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RqueueexecApplication

fun main(args: Array<String>) {
	runApplication<RqueueexecApplication>(*args)
}
