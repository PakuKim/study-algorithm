class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        return my_string.toMutableList().apply {
            val i = this[num1]
            this[num1] = this[num2]
            this[num2] = i
        }.joinToString("")
    }
}