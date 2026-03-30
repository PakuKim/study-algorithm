class Solution {
    fun solution(s: String): String {
        var answer: String = ""
        return s.groupBy { it }.filter { it.value.size == 1 }.keys.sorted().joinToString("")
    }
}