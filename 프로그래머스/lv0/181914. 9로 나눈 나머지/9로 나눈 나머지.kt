class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        return number.sumOf { it.digitToInt() } % 9
    }
}