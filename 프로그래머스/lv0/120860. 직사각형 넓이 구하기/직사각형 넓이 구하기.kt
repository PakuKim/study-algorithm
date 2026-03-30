import kotlin.math.abs

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        
        val minX = dots.minOf { it[0] }
        val maxX = dots.maxOf { it[0] }
        val minY = dots.minOf { it[1] }
        val maxY = dots.maxOf { it[1] }
        
        return abs(minX - maxX) * abs(minY - maxY)
    }
}