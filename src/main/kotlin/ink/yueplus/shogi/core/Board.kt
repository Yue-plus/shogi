package ink.yueplus.shogi.core

class Board(w: Byte, h: Byte) {

    private val squaresCount: Int

    init {
        if ( w > 1 && h > 1 ) {
            squaresCount = w * h
        } else {
            throw Exception("棋盘过小！")
        }
    }

    val board = arrayOfNulls<Square>(squaresCount)

    init {
        var i: Int = 0
        var wCount: Byte = 1
        var hCount: Byte = 1
        while (i < squaresCount) {
            if (hCount < h) {
                if (wCount < w) {
//                    board.set(i, Square())
                } else {
                    wCount++
                }
            } else {
                hCount++
            }
        }
    }

    val wHave: Array<Piece?> = arrayOf()
    val bHave: Array<Piece?> = arrayOf()

    fun mkPiece(wb: Boolean, b: Int, t: Piece) {
        TODO()
    }

    fun rmPiece() {
        TODO("移除棋子")
    }

    fun rmSquare() {
        TODO("移除棋盘一格")
    }

    fun rmRow() {
        TODO("移除棋盘一行")
    }

    fun rmColumn() {
        TODO("移除棋盘一列")
    }

    fun mvPiece() {
        TODO("移动棋子")
    }

    fun getPieceMove() {
        TODO("获取棋子可行走位置")
    }

    fun getPiecesList() {
        TODO("获取棋盘上棋子列表")
    }

}