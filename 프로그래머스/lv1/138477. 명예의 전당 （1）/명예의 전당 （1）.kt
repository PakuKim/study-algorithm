class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in score.indices) {
            answer += score.slice(0..i).sortedDescending().take(k).last()
        }
        
        return answer
    }
}