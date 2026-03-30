import kotlin.math.abs

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer = 0;
        
        val xDiff1 = abs(dots[0][0] - dots[1][0]).toDouble()
        val yDiff1 = abs(dots[0][1] - dots[1][1]).toDouble()

        val xDiff2 = abs(dots[2][0] - dots[3][0]).toDouble()
        val yDiff2 = abs(dots[2][1] - dots[3][1]).toDouble()
        

        if ((yDiff1 / xDiff1) == (yDiff2 / xDiff2)) {
            return 1
        }

        val xDiff3 = abs(dots[0][0] - dots[2][0]).toDouble()
        val yDiff3 = abs(dots[0][1] - dots[2][1]).toDouble()

        val xDiff4 = abs(dots[1][0] - dots[3][0]).toDouble()
        val yDiff4 = abs(dots[1][1] - dots[3][1]).toDouble()

        if ((yDiff3 / xDiff3) == (yDiff4 / xDiff4)) {
            return 1
        }
        
        return answer
    }
}