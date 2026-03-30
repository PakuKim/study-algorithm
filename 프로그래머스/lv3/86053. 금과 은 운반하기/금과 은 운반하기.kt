class Solution {
    fun solution(a: Int, b: Int, g: IntArray, s: IntArray, w: IntArray, t: IntArray): Long {
        var left = 0L
        var right = 1_000_000_000_000_000L
        var answer = right 
        
        while (left <= right) {
            val mid = (left + right) / 2
            var total = 0L
            var totalG = 0L
            var totalS = 0L
            
            for (i in g.indices) {
                var count = mid / (t[i] * 2L)
                if (mid % (t[i] * 2L) >= t[i]) count++
                
                val delivered = w[i] * count
                
                total += minOf(delivered, (g[i] + s[i]).toLong())
                totalG += minOf(delivered, g[i].toLong())
                totalS += minOf(delivered, s[i].toLong())
            }
            
            if (total >= a + b && totalG >= a && totalS >= b) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        
        return answer
    }
}