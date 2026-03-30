class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        return numbers.sorted().let {
            (it[0] * it [1]).coerceAtLeast(
                it[it.lastIndex] * it[it.lastIndex - 1]
            )
        }
    }
}