class Solution {
    fun solution(n: Int): IntArray {
        val answer = Array(n) { IntArray(n) }
        val dx = intArrayOf(1, 0, -1)
        val dy = intArrayOf(0, 1, -1)

        var direction = 0
        var x = 0
        var y = 0

        for (num in 1 .. (n * (n + 1) / 2)) {
            answer[x][y] = num

            var nx = x + dx[direction]
            var ny = y + dy[direction]

            if (nx !in 0 until n ||
                ny !in 0 until n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 3
                nx = x + dx[direction]
                ny = y + dy[direction]
            }
            
            x = nx
            y = ny
        }

        return answer.flatMap { it.filter { it > 0 } }.toIntArray()
    }
}