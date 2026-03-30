class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        val filter = arr.size % 2
        
        return arr.mapIndexed { index, value ->
            if (index % 2 != filter) value + n else value
        }.toIntArray()
    }
}