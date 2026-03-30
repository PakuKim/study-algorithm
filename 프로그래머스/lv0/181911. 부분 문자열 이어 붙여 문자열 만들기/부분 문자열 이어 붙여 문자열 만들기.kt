class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        return parts.mapIndexed { index, (start, end) ->
            my_strings[index].substring(start..end)
        }.joinToString("")
    }
}