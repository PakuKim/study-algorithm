class Solution {
    fun solution(word: String): Int {
        var answer = 0
        val vowels = listOf('A','E','I','O','U')
        
        var count = 0
        fun bfs(now: String) {
            if (now == word) {
                answer = count
                return
            }
            
            if (now.length == 5) return
            
            for (v in vowels) {
                count++
                bfs(now + v)
            }
        }
        bfs("")
        
        return answer
    }
    // [0, 0, 0, 0, 1] == 6 == (1+5)
    // [0, 0, 0, 1, ?] == 10 == (6+4)
    // [2, ?, ?, ?, ?] == 1563 == (1562+1)
    // [1, 2, 3 ,?, ?] == 1189 == (1186+3)
    // 5^n / 4
    // [781, 156, 31, 6, 1]
}