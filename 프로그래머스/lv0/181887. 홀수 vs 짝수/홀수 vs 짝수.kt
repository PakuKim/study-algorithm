class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        return return num_list.filterIndexed { index, _ -> index % 2 == 0 }.sum()
            .coerceAtLeast(num_list.filterIndexed { index, _ -> index % 2 == 1 }.sum())
    }
}