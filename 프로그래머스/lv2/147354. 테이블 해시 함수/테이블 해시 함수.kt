class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        return data.sortedWith(Comparator.comparingInt<IntArray> { it[col - 1] }
            .thenByDescending { it[0] })
            .withIndex()
            .filter { (it.index + 1) in row_begin..row_end }
            .fold(0) { acc, (index, row) ->
                acc xor row.sumOf { it % (index + 1) }
            }
    }
}