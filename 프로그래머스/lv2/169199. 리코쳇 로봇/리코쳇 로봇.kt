class Solution {
    fun solution(board: Array<String>): Int {
        var robot = 0 to 0
        var goal = 0 to 0
        val maxRow = board.size
        val maxCol = board[0].length
        for (row in 0 until maxRow) {
            for (col in 0 until maxCol) {
                when (board[row][col]) {
                    'R' -> robot = row to col
                    'G' -> goal = row to col
                }
            }
        }
        
        val queue = ArrayDeque<Triple<Int, Int, Int>>()
        val visited = Array(maxRow) { BooleanArray(maxCol) }
        queue.add(Triple(robot.first, robot.second, 0))
        visited[robot.first][robot.second] = true

        val dr = intArrayOf(1, -1, 0, 0)
        val dc = intArrayOf(0, 0, 1, -1)
        while(queue.isNotEmpty()) {
            val (row, col, count) = queue.removeFirst()
            if (row to col == goal) return count

            for (i in 0 until 4) {
                var r = row + dr[i]
                var c = col + dc[i]
                while (r in 0 until maxRow && c in 0 until maxCol && board[r][c] != 'D') {                 
                    r += dr[i]
                    c += dc[i]
                }
                r -= dr[i]
                c -= dc[i]
                
                if (!visited[r][c]) {
                    visited[r][c] = true
                    queue.add(Triple(r, c, count + 1))
                }
            }
        }
        
        return -1
    }
}