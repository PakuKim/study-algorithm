class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = 0
        for (i in 0 until code.length) {
            if (code[i] != '1') {
                if (i % 2 == mode) answer += code[i]
            } else {
                mode = (mode + 1) % 2
            }
        }
        
        return answer.ifBlank { "EMPTY" }
    }
}