class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        return intervals.flatMap { (start, end) ->
            arr.slice(start..end)
        }.toIntArray()
    }
}