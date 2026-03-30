class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var answer = intArrayOf(0, sequence.size)
        var left = 0
        var sum = 0
        
        for (right in sequence.indices) {
            sum += sequence[right]
            
            while(sum > k) {
                sum -= sequence[left++]
            }
            
            if (sum == k) {
                if (right - left < answer[1] - answer[0]) {
                    answer[0] = left
                    answer[1] = right
                }
            }
        }
        
        return answer
    }
}