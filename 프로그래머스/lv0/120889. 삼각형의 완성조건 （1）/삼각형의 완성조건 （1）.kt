class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        val max = sides.maxOf { it }
        return if (max * 2 < sides.sum()) 1 else 2
    }
}