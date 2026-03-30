class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        return num_list.indexOfFirst { it < 0 }
    }
}