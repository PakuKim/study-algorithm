class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list
        val idx = num_list.size - 1
        answer += if (num_list[idx] > num_list[idx - 1]) {
            num_list[idx] - num_list[idx - 1]
        } else {
            num_list[idx] * 2
        }
        return answer
    }
}