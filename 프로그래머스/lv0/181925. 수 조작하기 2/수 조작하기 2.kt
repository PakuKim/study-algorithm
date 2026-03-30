class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        
        for (i in 0 until numLog.size - 1) {
            val now = numLog[i]
            val next = numLog[i + 1]
            
            answer += figure(next - now)
        }
        
        return answer
    }
    
    fun figure(n: Int): Char {
        return when(n) {
            1 -> 'w'
            -1 -> 's'
            10 -> 'd'
            else -> 'a'
        }
    }
}