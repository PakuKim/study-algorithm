class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val mul = num_list.reduce { a, b ->
            a * b
        }
        val sum = num_list.sum().let { it * it } 
        
        return if (mul < sum) 1 else 0
    }
}