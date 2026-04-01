import java.util.*

class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val graph = mutableMapOf<Int, MutableList<Pair<Int,Int>>>()

        for ((a,b,c) in road) {
            graph.getOrPut(a) { mutableListOf() }.add(b to c)
            graph.getOrPut(b) { mutableListOf() }.add(a to c)
        }
        
        val costs = IntArray(N + 1) { Int.MAX_VALUE }
        fun dfs(node: Int, cost: Int) {
            if (cost >= costs[node]) return
            costs[node] = cost

            for ((next, nextCost) in graph[node]!!) {
                dfs(next, cost + nextCost)
            }
        }
        dfs(1, 0)

        return costs.count { it <= k }
    }
}