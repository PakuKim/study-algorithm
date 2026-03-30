class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer += array.maxOf {it}
        answer += array.indexOf(answer[0])
        return answer
    }
}