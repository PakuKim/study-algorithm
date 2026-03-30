class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer = 0
        val n = board.size

        while (true) {
            var removed = false

            for (row in 0 until n) {
                for (col in 0 until n) {
                    val num = board[row][col]
                    if (num != 0) {
                        if (canRemove(board, num)) {
                            removeBlock(board, num)
                            answer++
                            removed = true
                        }
                    }
                }
            }

            if (!removed) break
        }

        return answer
    }
}

fun canRemove(board: Array<IntArray>, num: Int): Boolean {
    val blocks = mutableListOf<Pair<Int, Int>>()

    for (r in board.indices) {
        for (c in board.indices) {
            if (board[r][c] == num) blocks += r to c
        }
    }
    
    val rows = blocks.map { it.first }
    val cols = blocks.map { it.second }
    
    val rMin = rows.minOf{ it }
    val rMax = rows.maxOf{ it }
    val cMin = cols.minOf{ it }
    val cMax = cols.maxOf{ it }

    for (r in rMin..rMax) {
        for (c in cMin..cMax) {
            if (board[r][c] != 0 && board[r][c] != num) return false
            if (board[r][c] == 0 && !canDrop(board, r, c)) return false
        }
    }

    return true
}

fun canDrop(board: Array<IntArray>, row: Int, col: Int): Boolean {
    for (r in 0 until row) {
        if (board[r][col] != 0) return false
    }
    return true
}

fun removeBlock(board: Array<IntArray>, num: Int) {
    for (r in board.indices) {
        for (c in board.indices) {
            if (board[r][c] == num) board[r][c] = 0
        }
    }
}