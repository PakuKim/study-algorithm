class Solution {
    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        var answer = 0
        val tree = Array(info.size) { mutableListOf<Int>() }

        for ((p, c) in edges) {
            tree[p].add(c)
        }

        fun dfs(sheep: Int, wolf: Int, nodes: List<Int>) {
            answer = maxOf(answer, sheep)

            for (node in nodes) {
                val nextNodes = nodes.toMutableList()
                nextNodes.remove(node)
                nextNodes.addAll(tree[node])

                if (info[node] == 0) {
                    dfs(sheep + 1, wolf, nextNodes)
                } else {
                    if (sheep > wolf + 1) {
                        dfs(sheep, wolf + 1, nextNodes)
                    }
                }
            }
        }
        
        dfs(1, 0, tree[0])
        
        return answer
    }
}