class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        return my_string.removePrefix(is_prefix).let {
            if (it == my_string) 0 else 1
        }
    }
}