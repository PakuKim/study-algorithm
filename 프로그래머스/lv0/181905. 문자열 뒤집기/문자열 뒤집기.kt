class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer: String = ""
        return my_string.replaceRange(s..e, my_string.substring(s..e).reversed())
    }
}