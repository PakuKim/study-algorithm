import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        
        repeat(number) {
            val n = (it + 1)
            var count = 0
            
            for (i in 1..sqrt(n.toDouble()).toInt()) {
                if (n % i == 0) {
                    count++
                    if (i != n / i) count++
                }
            }
            
            answer += if (count > limit) power else count
        }
        
        return answer
    }
}