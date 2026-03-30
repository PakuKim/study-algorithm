class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        return str_list.filter { !it.contains(ex) }.joinToString("")
    }
}