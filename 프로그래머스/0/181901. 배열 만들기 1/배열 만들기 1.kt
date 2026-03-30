class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        (k..n).forEach {
            if (it % k == 0) answer += it 
        }
        
        return answer
    }
}