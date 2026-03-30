class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        return num_list.toList().chunked(n).map { 
            it.toIntArray()
        }.toTypedArray()
    }
}