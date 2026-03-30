class Solution {
    fun solution(order: IntArray): Int {
        var answer = 0
        val stack = ArrayDeque<Int>()
        
        for (current in 1 .. order.size) {
            if (current == order[answer]) {
                answer++
            } else {
                stack.addLast(current)
            }
            
            while (stack.isNotEmpty() && stack.last() == order[answer]) {
                stack.removeLast()
                answer++
            }
        }

        return answer
    }
}