class Solution {
    fun solution(s: String): String {
        var answer = ""
        return s.split(" ").map {
            it.lowercase().replaceFirstChar { it.uppercase() }
        }.joinToString(" ") {it}
    
    }
}