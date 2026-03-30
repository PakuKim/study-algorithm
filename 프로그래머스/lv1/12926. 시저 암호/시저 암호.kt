class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        return s.map {
            when {
                it.isUpperCase() -> 'A' + (it - 'A' + n) % 26
                it.isLowerCase() -> 'a' + (it - 'a' + n) % 26
                else -> it
            }
        }.joinToString("")
    }
}