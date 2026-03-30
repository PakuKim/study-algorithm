class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        return my_string.replaceRange(s, overwrite_string.length + s, overwrite_string)
    }
}