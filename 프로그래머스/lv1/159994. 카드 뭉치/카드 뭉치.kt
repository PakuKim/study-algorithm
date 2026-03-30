class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        var idx1 = 0
        var idx2 = 0
        
        for (i in goal.indices) {
            val word = goal[i]
            
            if (cards1.getOrNull(idx1) == word) {
                idx1++
                continue
            } else if (cards2.getOrNull(idx2) == word) {
                idx2++
                continue
            } else {
                return "No"
            }
        }
        
        return "Yes"
    }
}