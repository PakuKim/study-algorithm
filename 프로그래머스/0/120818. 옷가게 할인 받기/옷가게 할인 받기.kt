class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        return when {
            price >= 500_000 -> sale(price, 20)
            price >= 300_000 -> sale(price, 10)
            price >= 100_000 -> sale(price, 5)
            else -> price
        }
    }
    
    fun sale(a: Int, b: Int): Int {
        return (a - (a.toDouble().div(100).times(b))).toInt()
    }
}