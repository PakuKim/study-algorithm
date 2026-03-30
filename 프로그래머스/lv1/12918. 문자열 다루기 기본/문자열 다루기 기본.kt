class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        return s.all { it.isDigit() } && (s.length == 4 || s.length == 6)
    }
}