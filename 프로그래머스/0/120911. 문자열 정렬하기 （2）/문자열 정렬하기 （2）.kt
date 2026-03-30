class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        return my_string.toList().map {
            it.lowercase()
        }.sorted().joinToString("")
    }
}