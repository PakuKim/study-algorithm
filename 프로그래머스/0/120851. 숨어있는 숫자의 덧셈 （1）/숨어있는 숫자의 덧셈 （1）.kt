class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        return my_string.sumOf {
            it.digitToIntOrNull() ?: 0
        }
    }
}