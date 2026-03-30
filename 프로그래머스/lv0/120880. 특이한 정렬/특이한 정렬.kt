import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return numlist.sortedDescending().sortedBy { abs(it - n) }
            .toIntArray()
    }
}