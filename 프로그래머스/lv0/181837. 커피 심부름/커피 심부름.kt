class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        val la = order.count() { it.contains("latte") }
        return (la * 5000) + (order.size - la) * 4500
    }
}