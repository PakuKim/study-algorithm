class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        numlist.forEach {
            if (it % n == 0) answer += it
        }
        
        return answer
    }
}