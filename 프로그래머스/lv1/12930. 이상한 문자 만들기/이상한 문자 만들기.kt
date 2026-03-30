class Solution {
    fun solution(s: String): String {
        var answer = ""
        return s.split(" ").joinToString(" ") {
            it.mapIndexed { index, c ->
                if (index % 2 == 0) c.uppercase() else c.lowercase()
            }.joinToString("")
        }
    }
}