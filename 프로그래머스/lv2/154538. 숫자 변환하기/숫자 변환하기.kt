class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val queue = ArrayDeque<Pair<Int, Int>>().apply { add(x to 0) }
        val visited = BooleanArray(y + 1).apply { this[x] = true }
        
        while (queue.isNotEmpty()) {
            val (cur, count) = queue.removeFirst()
            if (cur == y) return count
            
            val list = listOf(cur * 2, cur * 3, cur + n)
            for (next in list) {
                if (next <= y && !visited[next]) {
                    queue.add(next to count + 1)
                    visited[next] = true
                }
            }
        }
        
        return -1
    }
}