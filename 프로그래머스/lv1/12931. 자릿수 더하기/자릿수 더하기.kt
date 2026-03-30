class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        return n.toString().toList().sumOf { it.digitToInt() }
    }
}