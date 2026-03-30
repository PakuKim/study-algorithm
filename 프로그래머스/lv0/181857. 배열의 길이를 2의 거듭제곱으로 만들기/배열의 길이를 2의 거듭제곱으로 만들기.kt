class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        var next = 1
        
        while (answer.size != next) {
            if (answer.size < next) {
                answer += IntArray(next - answer.size) { 0 }
                break
            }
            
            next *= 2
        }
        
        return answer
    }
}
