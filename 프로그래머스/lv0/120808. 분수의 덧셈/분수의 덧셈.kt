class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        val bot = denom1 * denom2
        val top = (numer1 * denom2) + (numer2 * denom1)
        
        val div = div(top, bot)
        
        answer += top / div
        answer += bot / div
        
        return answer
    }
    
    fun div(a: Int, b: Int): Int {
        if (a % b == 0) return b
        
        return div(b, a % b)
    }
}