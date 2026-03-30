import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in 1 .. sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                answer += i
                if (i != n / i) answer += (n / i)
            }
        }
        
        return answer.sortedArray()
    }
}