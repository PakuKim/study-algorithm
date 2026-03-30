import kotlin.math.pow

class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        val size = (2).toDouble().pow(r.toString().length).toInt()
        
        for (i in 0 until size) {
            val n = i.toString(2).toInt() * 5
            if (n >= l && n <= r) answer += n
        }
        
        return answer.takeIf { it.isNotEmpty() } ?: intArrayOf(-1)
    }
}