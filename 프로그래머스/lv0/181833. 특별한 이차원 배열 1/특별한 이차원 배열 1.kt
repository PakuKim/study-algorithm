class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        return (0 until n).map { i ->
            (0 until n).map { j ->
                if (i == j) 1 else 0
            }.toIntArray()
        }.toTypedArray()
    }
}