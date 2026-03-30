import kotlin.math.abs

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer = IntArray(2)
        
        val origin = abs(lottos.count { win_nums.contains(it) } - 7)
        val deleted = lottos.count { it == 0 }
        
        answer[0] = if(deleted == 6) 1 else (origin.takeIf { it < 7 }?: 6) - deleted
        answer[1] = if(origin >= 6) 6 else origin
        
        return answer
    }
}