class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        return (n * 12_000) + (k * 2_000) - (n / 10 * 2000)
    }
}