class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        return strlist.map {
            it.length
        }.toIntArray()
    }
}