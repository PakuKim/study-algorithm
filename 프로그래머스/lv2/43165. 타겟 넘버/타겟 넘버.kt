class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        val queue = ArrayDeque<Pair<Int, Int>>().apply { add(0 to 0) }
        
        while(queue.isNotEmpty()) {
            val (index, sum) = queue.removeFirst()
            
            if (sum == target && index == numbers.size) answer++
            
            if (index < numbers.size) {
                queue.add(index + 1 to sum + numbers[index])
                queue.add(index + 1 to sum - numbers[index])
            }
        }
        
        return answer
    }
}