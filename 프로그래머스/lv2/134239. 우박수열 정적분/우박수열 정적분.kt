class Solution {
    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        var answer = DoubleArray(ranges.size)
        val sequence = mutableListOf<Int>()
        var cur = k
        while (cur > 1) {
            sequence.add(cur)
            cur = if (cur % 2 == 0) cur / 2 else cur * 3 + 1
        }
        sequence.add(1)
        
        val n = sequence.size
        val prefix = DoubleArray(n)
        for (i in 0 until n - 1) {
            val area = (sequence[i] + sequence[i + 1]) / 2.0
            prefix[i + 1] = prefix[i] + area
        }
        
        for (i in ranges.indices) {
            val (start, b) = ranges[i]
            val end = (n - 1) + b
            
            answer[i] = if (start > end) -1.0 else prefix[end] - prefix[start]
        }
        
        return answer
    }
}