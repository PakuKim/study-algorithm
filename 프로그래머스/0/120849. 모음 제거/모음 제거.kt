class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var vowel = arrayOf('a', 'e', 'i', 'o', 'u')
        return my_string.map { 
            if (vowel.contains(it)) "" else it
        }.joinToString("")
    }
}