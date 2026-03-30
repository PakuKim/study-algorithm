class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val ab = (a.toString() + b.toString()).toInt()
        val math = 2 * a * b
        return if (math > ab) math else ab
    }
}