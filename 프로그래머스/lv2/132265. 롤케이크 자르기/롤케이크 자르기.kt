class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        
        val left = hashSetOf<Int>()
        val right = mutableMapOf<Int, Int>()
        for (t in topping) {
            right[t] = right.getOrDefault(t, 0) + 1
        }
        
        for (i in topping.indices) {
            val t = topping[i]
            left.add(t)
            right[t] = right[t]!! - 1
            
            if (right[t] == 0) right.remove(t)
            if (left.size == right.size) answer++
        }
        
        return answer
    }
}