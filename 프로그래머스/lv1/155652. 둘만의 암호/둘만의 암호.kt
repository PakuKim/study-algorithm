class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        
        val alps = ('a'..'z').toMutableList().apply { 
            removeAll(skip.toList())
        }
        
        for (alp in s) {
            answer += alps[(alps.indexOf(alp) + index) % alps.size]
        }
        
        return answer
    }
}