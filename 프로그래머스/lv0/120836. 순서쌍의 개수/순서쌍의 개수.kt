class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        (1..n).forEach {
            if (n % it == 0) answer++
        }
        
        return answer
    }
}