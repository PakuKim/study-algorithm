class Solution {
    fun solution(n: Int): Int {
        var answer = 1
        for (i in 0 until n) {
            answer = answer * (2 * n - i) / (i + 1)
        }
        return answer / (n + 1)
    }
}