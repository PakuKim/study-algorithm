import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        return sqrt(n.toDouble()).let {
            if (it - it.toInt() == 0.0) {
                1
            }else {
                2
            }
        }
    }
}