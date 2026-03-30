class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        return arr.toMutableList().apply {
            remove(this.minOf { it })
        }.ifEmpty { mutableListOf(-1) }.toIntArray()
    }
}