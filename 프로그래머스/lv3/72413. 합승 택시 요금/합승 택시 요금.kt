class Solution {
    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
        var answer = 100_000_000
        
        val routes = Array(n + 1) { IntArray(n + 1) { answer } }

        for (i in 1..n) {
            routes[i][i] = 0
        }
        
        for (fare in fares) {
            val (c, d, f) = fare
            routes[c][d] = f
            routes[d][c] = f
        }
        
        for (k in 1..n) {
            for (i in 1..n) {
                for (j in 1..n) {
                    if (routes[i][j] > (routes[i][k] + routes[k][j])) {
                        routes[i][j] = (routes[i][k] + routes[k][j])
                    }
                }
            }
        }
        
        for (k in 1..n) {
            val fare = routes[s][k] + routes[k][a] + routes[k][b]
            if (fare < answer) answer = fare
        }
        
        return answer
    }
}