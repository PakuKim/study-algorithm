class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = -1
        
        arr.forEachIndexed { index, n ->
            if (n == 1 && index > idx - 1) {
                answer = index
                return index
            }
        }
        
        return answer
    }
}