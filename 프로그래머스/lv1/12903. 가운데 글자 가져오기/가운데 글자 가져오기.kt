class Solution {
    fun solution(s: String): String {
        var answer = ""
        val c = s.length / 2
        
        if (s.length % 2 == 0) {
            answer += s[c - 1]
            answer += s[c]
        } else {
            answer += s[c]
        }
        
        return answer
    }
}