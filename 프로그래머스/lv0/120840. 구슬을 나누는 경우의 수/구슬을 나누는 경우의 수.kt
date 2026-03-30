import kotlin.math.roundToInt
class Solution {
    fun solution(balls: Int, share: Int): Int {
        var answer: Int = 0

        val a = factorial(balls)
        val b = factorial(share)
        val ab = factorial(balls - share)
        
        println(a)
        println(b)
        println(ab)
        
        println(a / ab)
        
        return (a / (ab * b)).roundToInt()
    }

   fun factorial(n: Int): Double {
        return if (n <= 1) 1.0
        else (2..n).fold(1.0) { total, a -> total * a }
    }
}