class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 0
        return str1.contains(str2).let {
            if (it) 1 else 2
        }
    }
}