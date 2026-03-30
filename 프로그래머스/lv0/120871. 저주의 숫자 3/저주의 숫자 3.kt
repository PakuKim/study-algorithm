class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        repeat(n) {
            answer++
            while(answer % 3 == 0 || answer.toString().contains('3')) {
                answer++
            }
        }
        
        return answer
    }
}