class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
    
        return my_string.toList().chunked(m).map {
            it[c - 1]
        }.joinToString("")
    }
}