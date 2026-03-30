class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var answer = n
        val graph = Array(n + 1) { mutableListOf<Int>() }
        val visited = BooleanArray(n + 1)

        for ((a,b) in wires) {
            graph[a].add(b)
            graph[b].add(a)
        }
        
        fun dfs(node: Int): Int {
            visited[node] = true

            var count = 1
            for (child in graph[node]) {
                if (!visited[child]) count += dfs(child)
            }
            answer = minOf(answer, Math.abs(count - (n - count)))

            return count
        }
        dfs(n)

        return answer
    }
}