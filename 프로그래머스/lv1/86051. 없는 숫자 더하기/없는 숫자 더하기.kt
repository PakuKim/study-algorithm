class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        return (1..9).sum() - numbers.sum()
    }
}