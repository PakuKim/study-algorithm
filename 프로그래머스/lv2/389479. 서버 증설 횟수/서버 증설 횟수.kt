class Solution {
    fun solution(players: IntArray, m: Int, k: Int): Int {
        var answer: Int = 0
        val servers = mutableListOf<Int>()
        
        for (player in players) {
            for (i in servers.indices) {
                servers[i] -= 1
            }
            servers.removeAll { it <= 0 }
            
            val acceptable = m + (servers.size * m)
            if (player < acceptable) continue
            
            val n = (player / m - servers.size)
            repeat(n) { servers.add(k) }
            answer += n
        }
        
        return answer
    }
}