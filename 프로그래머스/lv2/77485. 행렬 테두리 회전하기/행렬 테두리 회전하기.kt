class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        val box = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                box[i][j] = (i * columns + j) + 1
            }
        }
        
        val dx = listOf(0, 1, 0, -1)
        val dy = listOf(1, 0, -1, 0)
        for ((x1,y1,x2,y2) in queries.map { it.map { it - 1 } }) {
            var x = x1
            var y = y1
            var dir = 0
            var prev = box[x][y]
            var min = prev

            while (dir < 4) {
                val nx = x + dx[dir]
                val ny = y + dy[dir]
                if (nx !in x1..x2 || ny !in y1..y2) {
                    dir++
                    continue
                }

                val temp = box[nx][ny]
                box[nx][ny] = prev
                prev = temp
                min = minOf(min, prev)
                x = nx
                y = ny
            }
            answer.add(min)
        }
        
        return answer.toIntArray()
    }
}