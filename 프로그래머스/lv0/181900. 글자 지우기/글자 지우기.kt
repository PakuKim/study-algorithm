class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""
        return my_string.mapIndexed { index, n ->
            if (indices.contains(index)) ""
            else n
        }.joinToString("")
    }
}