import kotlin.math.sqrt

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        
        return maxPair(yellow, brown).toList().map {
            it + 2
        }.toIntArray()
    }

    fun maxPair(n: Int, limit: Int): Pair<Int,Int> {
        var result = n to 1

        for (i in 1 .. sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                val j = n / i
                if ((i + j) * 2 + 4 == limit) {
                    result = j to i
                    break
                }
            }
        }

        return result
    }
}