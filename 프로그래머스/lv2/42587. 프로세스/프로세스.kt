class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue = ArrayDeque<Pair<Int, Int>>().apply {
            addAll(priorities.mapIndexed { index, i -> i to index })
        }
        
        while(queue.isNotEmpty()) {
            val (process, index) = queue.removeFirst()
            
            if (!queue.any { it.first > process }) {
                answer++
                if (index == location) {
                    break
                }
            } else {
                queue.add(process to index)
            }
        }
        
        return answer
    }
}