class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        
        return ((1..count).sumOf {
            (price * it).toLong()
        } - money.toLong()).takeIf { it > 0 } ?: 0 
    }
}