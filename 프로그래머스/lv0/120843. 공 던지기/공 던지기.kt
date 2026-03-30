class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        return numbers[((k - 1) * 2) % numbers.size]
    }
}