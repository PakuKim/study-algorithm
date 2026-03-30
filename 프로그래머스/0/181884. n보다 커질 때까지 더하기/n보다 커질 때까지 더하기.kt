class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        return numbers.reduce { total, i -> if (total > n) return@reduce total else total + i }
    }
}