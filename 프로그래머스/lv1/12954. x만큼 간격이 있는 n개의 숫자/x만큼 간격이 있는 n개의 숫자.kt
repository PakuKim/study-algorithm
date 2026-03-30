import kotlin.math.abs

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        
        if (n == 0) return answer
        
        return (1 .. n).map {
           it.times(x.toLong())
        }.toLongArray()
    }
}