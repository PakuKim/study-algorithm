class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        (n - 1 downTo 1).forEach {
            if (n % it == 1) answer = it
        }
        
        return answer
    }
}