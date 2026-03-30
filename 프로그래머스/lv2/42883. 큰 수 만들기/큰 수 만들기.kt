class Solution {
    fun solution(number: String, k: Int): String {
        var answer = ""
        val nums = number.map { it.digitToInt() }
        val stack = ArrayDeque<Int>()
        var remain = k
        
        for (num in nums) {
            while (stack.isNotEmpty() && num > stack.last() && remain > 0) {
                stack.removeLast()
                remain--
            }
            stack.addLast(num)
        }
        
        repeat(remain) { stack.removeLast() }
        
        return stack.joinToString("")
    }
}