class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var answer: Int = -1
        
        fun backTracking(hp: Int, remain: List<IntArray>, count: Int) {
            if (remain.all { it[0] > hp }) {
                answer = Math.max(answer, count)
                return
            }
            
            for (i in 0 until remain.size) {
                val (require, spend) = remain[i]
                if (hp >= require) {
                    val result = remain.toMutableList().apply { removeAt(i) }
                    backTracking(hp - spend, result, count + 1)
                }
            }
        }
        
        backTracking(k, dungeons.toList(), 0)
        
        return answer
    }
}