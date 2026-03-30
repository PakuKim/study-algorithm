import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        (left..right).forEach {
            if (calc(it) % 2 == 0) {
                answer += it
            } else {
                answer -= it
            }
        }
        
        return answer
    }
    
    fun calc(n: Int): Int {
        var count = 0
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                count++
                if (i != n / i) count++
            }
        }

        return count
    }
}