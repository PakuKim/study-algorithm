class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        
        return (1 until food.size).map {
            val size = food[it] / 2
            println(it)
            var a = ""
            repeat(size) { _ -> a += it }
            a
        }.joinToString("").let { 
            it + "0" + it.reversed()
        }
    }
}