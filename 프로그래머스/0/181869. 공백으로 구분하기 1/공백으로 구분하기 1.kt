class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return my_string.split("\\s".toRegex()).toTypedArray()
    }
}