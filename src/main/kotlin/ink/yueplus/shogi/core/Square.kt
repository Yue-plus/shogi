package ink.yueplus.shogi.core

data class Square(
    val N: Square?,
    val NE: Square?,
    val E: Square?,
    val ES: Square?,
    val S: Square?,
    val SW: Square?,
    val W: Square?,
    val WN: Square?,

    var WB: Boolean?,
    var squareIs: Piece?,
)