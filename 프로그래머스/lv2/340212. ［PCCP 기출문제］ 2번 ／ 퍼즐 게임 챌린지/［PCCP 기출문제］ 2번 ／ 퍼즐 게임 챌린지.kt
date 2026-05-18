class Solution {
    fun solution(diffs: IntArray, times: IntArray, limit: Long): Int {
        var answer = diffs.maxOf { it }
        var left = 1
        var right = answer
        
        while (left < right) {
            val level = (left + right) / 2
            var time = times[0].toLong()
            
            for (i in 1 until times.size) {
                time += calc(level, diffs[i], times[i], times[i - 1])
            }
            
            if (time <= limit) {
                answer = minOf(answer, level)
                right = level
            } else {
                left = level + 1
            }
        }
        
        return answer
    }
    
    fun calc(level: Int, diff: Int, timeCur: Int, timePrev: Int): Int {
        return if (level >= diff) timeCur
        else (timeCur + timePrev) * (diff - level) + timeCur
    }
}