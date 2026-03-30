class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        return array.joinToString("").count { it == '7' }
    }
}