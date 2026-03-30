class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in 0 until arr.size) {
            if (answer.isEmpty()) {
                answer += arr[i]
            } else {
                val last = answer.last()
                if (last == arr[i]) {
                    answer = answer.copyOfRange(0, answer.size - 1)
                } else {
                    answer += arr[i]
                }
            }
        }
        
        return answer.takeIf { it.isNotEmpty() } ?: intArrayOf(-1)
    }
}