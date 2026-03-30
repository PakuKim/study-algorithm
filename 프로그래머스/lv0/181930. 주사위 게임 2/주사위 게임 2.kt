import kotlin.math.pow
import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = a + b + c

        var array = arrayOf(a,b,c)
        var count = array.groupBy { it }.count()
        
        while (count - 3 != 0) {
            answer *= array.sumOf {
                it.toDouble().pow(count - 4).toInt()
            }
            
            count++
        }
        
        return answer
    }
   
}