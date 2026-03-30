enum class Direction {
    RIGHT, DOWN, LEFT, TOP
}

class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n) { IntArray(n) }

        var direction = Direction.RIGHT
        var start = 0
        var end = n - 1
        var c = 0
        var r = 0

        (1..(n * n)).forEach {
            answer[c][r] = it

            when(direction) {
                Direction.RIGHT -> {
                    r++
                    if (r == end) direction = Direction.DOWN
                }
                Direction.DOWN -> {
                    c++
                    if (c == end) direction = Direction.LEFT
                }
                Direction.LEFT -> {
                    r--
                    if (r == start) direction = Direction.TOP
                }
                Direction.TOP -> {
                    c--
                    if (c == start) {
                        direction = Direction.RIGHT
                        c = start++
                        r = start++
                    }
                }
            }
        }

        return answer
    }
}