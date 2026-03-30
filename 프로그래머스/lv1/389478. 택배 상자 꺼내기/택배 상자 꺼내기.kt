class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var answer: Int = 0
        var box = num
        
        while(box <= n) {
            val direction = box % w
            val increase = if (direction == 0) {
                1
            } else {
                (w - direction) * 2 + 1
            }
            
            box += increase
            
            answer++
        }
        
        return answer
    }
}