class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in 1 until n+1) {
            if (i % 2 != 0) answer += i
        }
        return answer
    }
}