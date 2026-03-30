import kotlin.math.min
import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        return (min(a, b) .. max(a, b)).sumOf { it.toLong() }
    }
}