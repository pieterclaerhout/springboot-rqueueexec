package be.yellowduck.springboot.rqueueexec

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@SpringBootApplication
@EnableRedisRepositories
class RqueueexecApplication

fun main(args: Array<String>) {
	runApplication<RqueueexecApplication>(*args)
}
