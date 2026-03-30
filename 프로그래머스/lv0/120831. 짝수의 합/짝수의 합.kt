class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        repeat(n + 1) {
            if (it % 2 == 0) answer += it
        }
        return answer
    }
}