class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        val sortedList = citations.sorted()
        if(sortedList.last() == 0) {
            return answer
        }
        for(i in sortedList.indices.reversed()) {
            if(sortedList[i] > answer) {
                answer++
            }
        }
        
        return answer
    }
}