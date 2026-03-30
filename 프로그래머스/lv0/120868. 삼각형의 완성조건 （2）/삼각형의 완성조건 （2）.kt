class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        return sides.minOf { it } - 1 + sides.minOf { it }
    }
}