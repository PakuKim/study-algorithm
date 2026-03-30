class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        return order.toString().map { 
            if (it == '3' || it == '6' || it == '9') 1
            else 0
        }.sum()
    }
}