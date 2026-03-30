class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1
        while (true) {
            if ((6 * answer++) % n == 0) break
        }
        return answer
    }
}
