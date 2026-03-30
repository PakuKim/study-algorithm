class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return my_str.chunked(n).toTypedArray()
    }
}