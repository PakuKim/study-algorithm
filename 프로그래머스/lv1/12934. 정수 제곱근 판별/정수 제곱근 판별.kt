import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        return sqrt(n.toDouble()).let {
            val long = it.toLong()
            if (it - long != 0.0) {
                -1
            } else {
                (long + 1) * (long + 1)
            }
        }
    }
}