package ink.yueplus.shogi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShogiApplication

fun main(args: Array<String>) {
    runApplication<ShogiApplication>(*args)
}
