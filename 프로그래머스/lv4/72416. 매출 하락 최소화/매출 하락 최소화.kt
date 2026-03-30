class Solution {
    fun solution(sales: IntArray, links: Array<IntArray>): Int {
        val size = sales.size
        var chart = Array(size) { mutableListOf<Int>() }
        val dp = Array(size) { IntArray(2) }
        
        for (link in links) {
            val (parent, child) = link
            chart[parent - 1].add(child - 1)
        }
        
        fun dfs(node: Int) {
            dp[node][1] = sales[node]
            dp[node][0] = 0
            
            if (chart[node].isEmpty()) return
            
            var canAbsent = true
            var diff = Int.MAX_VALUE
            for (child in chart[node]) {
                dfs(child)
                dp[node][1] += minOf(dp[child][0], dp[child][1])
                
                if (dp[child][1] <= dp[child][0]) {
                    dp[node][0] += dp[child][1]
                    canAbsent = false
                } else {
                    dp[node][0] += dp[child][0]
                    diff = minOf(diff, dp[child][1] - dp[child][0])
                }
            }
            println("node:${node + 1}, dp0: ${dp[node][0]} dp1: ${dp[node][1]}")
            
            if (canAbsent) dp[node][0] += diff
        }
    
        dfs(0)

        return minOf(dp[0][0], dp[0][1])
    }
}