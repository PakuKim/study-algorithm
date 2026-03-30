class Solution {
    fun solution(s: String): Int {
        var answer = 0
        return when {
            s[0].isDigit() -> s.toInt()
            else -> {
                val num = s.drop(1).toInt()
                val syntax = s[0]
                
                if (syntax == '-') {
                    num - (num * 2)
                } else {
                    num
                }
            }
        }
    }
}