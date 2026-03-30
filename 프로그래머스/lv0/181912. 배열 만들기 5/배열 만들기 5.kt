class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        intStrs.forEach {
            it.substring(s..s+l-1).toInt().let {
                if(it > k) answer += it
            }
        }
        return answer
    }
}