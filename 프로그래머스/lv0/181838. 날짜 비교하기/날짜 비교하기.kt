class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0
        
        date1.forEachIndexed { index, date ->
            if (date > date2[index]) return 0
            if (date < date2[index]) return 1
        }
        
        return answer
    }
}