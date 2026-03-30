class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var drawing = (0..0)
      
        for(wall in section) {
            if (!drawing.contains(wall)) {
                drawing = (wall..(wall + m - 1))
                answer++
            } else {
                continue
            }
        }
        
        return answer
    }
}