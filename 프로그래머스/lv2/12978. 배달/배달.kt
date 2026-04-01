import java.util.*

class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val graph = mutableMapOf<Int, MutableList<Pair<Int,Int>>>()

        for ((a,b,c) in road) {
            graph.getOrPut(a) { mutableListOf() }.add(b to c)
            graph.getOrPut(b) { mutableListOf() }.add(a to c)
        }
        
        fun dijkstra(n: Int): IntArray {
            val costs = IntArray(N + 1) { Int.MAX_VALUE }
            val queue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
            
            costs[1] = 0
            queue.add(1 to 0)
            
            while (queue.isNotEmpty()) {
                val (node, cost) = queue.poll()!!
                if (cost > costs[node]) continue
                
                for ((next, nextCost) in graph[node]!!) {
                    val newCost = cost + nextCost
                    
                    if (newCost < costs[next]) {
                        costs[next] = newCost
                        queue.add(next to newCost)
                    }
                }
            }
            
            return costs
        }

        return dijkstra(N).count { it <= k }
    }
}