class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        return tangerine.groupBy { it }.values
            .sortedByDescending { it.size }
            .flatten()
            .take(k)
            .distinct()
            .count()
    }
}