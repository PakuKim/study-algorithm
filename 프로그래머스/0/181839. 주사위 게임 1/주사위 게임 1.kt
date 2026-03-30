import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        return when {
            (a % 2 == 1) && (b % 2 == 1) -> (a * a) + (b * b)
            (a % 2 == 1) || (b % 2 == 1) -> (a + b) * 2
            else -> abs(a - b)
        }
    }
}