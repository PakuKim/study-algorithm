class Solution {
    fun solution(s: String): String {
        val numbers = s.split(" ").map(String::toInt)
        return "${numbers.minOrNull()} ${numbers.maxOrNull()}"
    }
}