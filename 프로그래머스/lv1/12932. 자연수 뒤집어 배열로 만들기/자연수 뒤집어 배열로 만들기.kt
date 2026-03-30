class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        return n.toString().map { it.digitToInt() }.reversed().toIntArray()
    }
}