class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        return when {
            ineq == ">" -> {
                if (eq == "=") {
                    if (n >= m) 1 else 0
                } else {
                    if (n > m) 1 else 0
                }
            }
            else -> {
                if (eq == "=") {
                    if (n <= m) 1 else 0
                } else {
                    if (n < m) 1 else 0
                }
            }
        }
    }
}