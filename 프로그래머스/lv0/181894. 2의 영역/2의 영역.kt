class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val start = arr.indexOfFirst { it == 2 }
        val end = arr.indexOfLast { it == 2 }
        return when {
            start == -1 -> intArrayOf(-1)
            end == -1 -> intArrayOf(-1)
            else -> arr.slice(start..end).toIntArray()
        }
    }
}