class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val num = n % 2
        
        for (i in 1 until n + 1) {
            if (num == 0) {
                if (i % 2 == 0) answer += (i * i)
            } else {
                if (i % 2 == 1) answer += i
            }
        }
        
        return answer
    }
}