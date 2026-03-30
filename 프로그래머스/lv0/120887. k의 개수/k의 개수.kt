class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        return (i..j).sumOf { it.toString().count { it.digitToInt() == k } }
    }
}