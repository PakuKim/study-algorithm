class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        val primes = arrayOf(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
            73, 79, 83, 89, 97
        )
        
        (4..n).forEach {
            if(!primes.contains(it)) answer++
        }
        
        return answer
    }
}