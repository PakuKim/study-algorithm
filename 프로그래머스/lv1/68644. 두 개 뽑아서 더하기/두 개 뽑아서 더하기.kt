class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = hashSetOf<Int>()
        
        for (i in 0 until numbers.size - 2) {
            for (j in i + 1 until numbers.size) {
                answer += numbers[i] + numbers[j]
            }
        }
        return answer.sorted().toIntArray()
    }
}