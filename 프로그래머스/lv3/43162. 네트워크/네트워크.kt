class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(n)
        val queue = ArrayDeque<Int>()
        
        fun bfs(now: Int) {
            queue.add(now)
            visited[now] = true
            
            while(queue.isNotEmpty()) {
                val current = queue.removeFirst()
                
                for (next in 0 until n) {
                    if (!visited[next] && computers[current][next] == 1) {
                        visited[next] = true
                        queue.add(next)
                    }
                }
            }
        }
        
        for (i in 0 until n) {
            if (!visited[i]) {
                answer++
                bfs(i)
            }
        }
        
        return answer
    }
}