class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val queue = (queue1 + queue2).map(Int::toLong)
        val total = queue.sum()
        if (total % 2 != 0L) return -1
        val target = total / 2
        val size = queue1.size

        var sum = queue.subList(0, size).sum()
        var count = 0
        var left = 0
        var right = size
        while (count <= size * 3) {
            if (sum == target) return count
            else if (sum > target) sum -= queue[left++]
            else sum += queue[right++ % queue.size]
            
            count++
        }
        
        return -1
    }
}