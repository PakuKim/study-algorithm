class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer = IntArray(emergency.size)
        
        emergency.sortedDescending().forEachIndexed { index, e ->
            answer[emergency.indexOf(e)] = index + 1
        }
        
        return answer
    }
}