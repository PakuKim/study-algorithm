class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var max = 0
        
        array.groupBy { it }.map { (key, value) ->
            if (value.size == max) {
                answer = -1
            } else if (value.size > max) {
                answer = key
                max = value.size
            }
        }
        
        return answer
    }
}