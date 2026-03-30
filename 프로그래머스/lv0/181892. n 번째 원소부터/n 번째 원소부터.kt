class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return num_list.slice(n-1..num_list.size - 1).toIntArray()
    }
}