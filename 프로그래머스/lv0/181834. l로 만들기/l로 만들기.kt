class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        return myString.map {
            if (it < 'l') 'l' else it
        }.joinToString("")
    }
}