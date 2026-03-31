class Solution {
    fun solution(maps: Array<String>): Int {
        var answer: Int = 0
        var current = 0 to 0
        var lever = 0 to 0
        var exit = 0 to 0
        for (i in maps.indices) {
            val row = maps[i]
            for (j in row.indices) {
                val col = row[j]
                when (col) {
                    'S' -> current = i to j
                    'L' -> lever = i to j
                    'E' -> exit = i to j
                }
            }
        }
        
        val maxRow = maps.size
        val maxCol = maps[0].length
        fun bfs(start: Pair<Int,Int>, target: Pair<Int,Int>): Int {
            val queue = ArrayDeque<Pair<Pair<Int,Int>, Int>>()
            val visited = Array(maxRow) { BooleanArray(maxCol) }
            queue.add(start to 0)
            visited[start.first][start.second] = true

            val dr = intArrayOf(1, -1, 0, 0)
            val dc = intArrayOf(0, 0, 1, -1)
            while (queue.isNotEmpty()) {
                val cur = queue.removeFirst()
                if (cur.first == target) return cur.second
                val (row, col) = cur.first

                for (i in 0 until 4) {
                    val r = row + dr[i]
                    val c = col + dc[i]
                    if (r !in 0 until maxRow || c !in 0 until maxCol) continue
                    if (!visited[r][c] && maps[r][c] != 'X') {
                        visited[r][c] = true
                        queue.add(r to c to cur.second + 1)
                    }
                }
            }

            return -1
        }

        val toLever = bfs(current, lever)
        if (toLever == -1) return -1
        val toExit = bfs(lever,exit)
        if (toExit == -1) return -1

        return toLever + toExit
    }
}