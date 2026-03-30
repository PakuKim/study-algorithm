class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        return my_string.split("[a-zA-z]".toRegex())
            .filter { it.isNotBlank() }
            .sumOf { it.toInt() }
    }
}