class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        return numbers.sortedDescending().let {
            it[0] * it[1]
        }
    }
}