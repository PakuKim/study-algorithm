class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
        return myString.substring(0..myString.lastIndexOf(pat) + pat.length - 1)
    }
}