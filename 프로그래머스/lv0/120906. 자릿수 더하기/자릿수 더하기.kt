class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        return n.toString().sumOf { it.digitToInt() }
    }
}