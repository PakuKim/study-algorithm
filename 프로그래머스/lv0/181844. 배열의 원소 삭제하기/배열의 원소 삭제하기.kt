class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        return arr.toMutableList().apply {
            removeAll { delete_list.contains(it) }
        }.toIntArray()
    }
}