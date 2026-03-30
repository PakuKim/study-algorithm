class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val ab = (a.toString() + b.toString()).toInt()
        val ba = (b.toString() + a.toString()).toInt()
        return if (ba > ab) ba else ab
    }
}