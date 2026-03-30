class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size) { -1 }
        val stack = ArrayDeque<Int>()
        val right = numbers.toMutableList()
        
        for (i in numbers.indices) {
            while (stack.isNotEmpty() && numbers[stack.last()] < numbers[i]) {
                answer[stack.removeLast()] = numbers[i]
            }
            stack.addLast(i)
        }
        
        return answer
    }
}