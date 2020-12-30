package ink.yueplus.shogi.core

import org.junit.jupiter.api.Test

class BoardTest {

    @Test
    fun baseTest() {
        val b = Board(9, 9)
        println(
            b.bHave.toString()
        )
    }

}