class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        return  score.sortedDescending().chunked(m).filter { it.size == m }
        .sumOf { it.minOf { it } * m }
    }
}