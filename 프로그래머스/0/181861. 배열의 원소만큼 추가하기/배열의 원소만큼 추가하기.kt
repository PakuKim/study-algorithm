class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr) {
            repeat(i) {
                answer += i
            }
        }
        return answer
    }
}