class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        return myString.map {
            if (it == 'a' || it == 'A') 'A'
            else it.lowercase()
        }.joinToString("")
    }
}