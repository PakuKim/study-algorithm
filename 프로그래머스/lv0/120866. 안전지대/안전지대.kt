class Solution {
    fun solution(board: Array<IntArray>): Int {
    val column = board.size
    val row = board[0].size

    var answer = column * row

    val bombCoord: MutableSet<Pair<Int, Int>> = mutableSetOf()

    for (i in 0 until board.size) {
        for (j in 0 until board[i].size) {
            if (board[i][j] == 1) {
                bombCoord.add(i to j)
            }
        }
    }
    
    val t: MutableSet<Pair<Int, Int>> = mutableSetOf()

    bombCoord.forEach { bomb ->
        val (x, y) = bomb
        val minX = if (x > 0) x - 1 else x
        val maxX = if (x < column- 1) x + 1 else x
        val minY = if (y > 0) y - 1 else y
        val maxY = if (y < row - 1) y + 1 else y

        for (a in minY..maxY) {
            for (b in minX..maxX) {
                if (!t.contains(a to b)) {
                t.add(a to b)
                    
                }
            }
        }
    }

    print(t)
    return answer - t.size
    }
}