class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        return index_list.map {
            my_string[it]
        }.joinToString("")
    }
}