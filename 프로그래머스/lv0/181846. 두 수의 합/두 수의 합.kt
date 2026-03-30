class Solution {
    fun solution(a: String, b: String): String {
        var answer: String = ""
        return (a.toBigDecimal() + b.toBigDecimal()).toString()
    }
}