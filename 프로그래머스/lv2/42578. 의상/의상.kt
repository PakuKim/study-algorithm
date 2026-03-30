class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0

        return clothes.groupBy { it[1] }.values.fold(1) { acc, list ->
            acc * (list.size + 1)
        } - 1
    }
}