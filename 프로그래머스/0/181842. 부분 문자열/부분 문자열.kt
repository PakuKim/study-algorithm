class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 0
        return if(str2.contains(str1)) 1 else 0
    }
}