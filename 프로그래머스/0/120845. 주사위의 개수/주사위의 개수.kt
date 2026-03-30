class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 0
        return box.let { (a,b,c) ->
            (a - (a % n)) * (b - (b % n)) * (c - (c % n)) / (n * n * n)
        }
    }
}