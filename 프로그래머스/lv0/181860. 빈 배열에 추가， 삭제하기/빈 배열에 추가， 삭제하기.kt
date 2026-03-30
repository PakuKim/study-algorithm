class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        flag.forEachIndexed { index, bool ->
            if (bool) {
                answer += (0 until arr[index] * 2).map {
                    arr[index]
                }.toIntArray()
            } else {
                answer = answer.take(answer.size - arr[index]).toIntArray()
            }
        }
        
        return answer
    }
}