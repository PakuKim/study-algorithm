import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        
        var last = 99
        array.sortedArray().forEach { 
            val diff = abs(n - it)
            if (diff < last) {
                answer = it
                last = diff
            } else return@forEach
        }
        
        return answer
    }
}