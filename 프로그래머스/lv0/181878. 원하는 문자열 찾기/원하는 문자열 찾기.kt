class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        
        return if (myString.lowercase().contains(pat.lowercase())) 1 else 0
    }
}