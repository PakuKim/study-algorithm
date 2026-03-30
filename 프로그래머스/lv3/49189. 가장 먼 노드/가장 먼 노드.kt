import java.util.LinkedList

class Solution {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        val graph = Array(n) { mutableListOf<Int>() }
        for ((left, right) in edge) {
            graph[left - 1].add(right - 1)
            graph[right -1].add(left - 1)
        }

        val dist = IntArray(n) { -1 }.apply { this[0] = 0 }
        val queue = LinkedList<Int>().apply { offer(0) }

        while (queue.isNotEmpty()) {
            val cur = queue.poll() ?: 0
            for (next in graph[cur]) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1
                    queue.offer(next)
                }
            }
        }

        val maxDist = dist.maxOf { it }
        return dist.count { it == maxDist }
    }
}