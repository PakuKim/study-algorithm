class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        return num_list.sorted().takeLast(num_list.size - 5).toIntArray()
    }
}