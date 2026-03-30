class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val diff = num_list.size - n
        
        return num_list.takeLast(diff).toMutableList().apply {
            repeat(n) {
                add(num_list[it])
            }
        }.toIntArray()
    }
}