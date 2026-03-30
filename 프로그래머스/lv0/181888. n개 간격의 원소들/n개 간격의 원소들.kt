class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return num_list.filterIndexed { index, _ -> index % n == 0 }.toIntArray()
    }
}