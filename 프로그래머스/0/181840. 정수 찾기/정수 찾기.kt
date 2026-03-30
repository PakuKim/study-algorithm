class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        return if (num_list.contains(n)) 1 else 0
    }
}