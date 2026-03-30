class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        
        val n = elements.size
        val arr = elements + elements
        val result = HashSet<Int>()

        for (start in 0 until n) {
            var sum = 0
            for (len in 1..n) {
                sum += arr[start + len - 1]
                result.add(sum)
            }
        }
        
        return result.size
    }
}