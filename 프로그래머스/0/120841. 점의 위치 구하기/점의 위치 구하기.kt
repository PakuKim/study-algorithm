class Solution {
    fun solution(dot: IntArray): Int {
        var answer: Int = 0
        return when {
            dot[0] < 0 -> {
                if (dot[1] < 0) 3
                else 2
            }
            else -> {
                if (dot[1] < 0) 4
                else 1
            }
        }
    }
}