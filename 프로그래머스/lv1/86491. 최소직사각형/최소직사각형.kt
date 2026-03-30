class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        val max = sizes.maxOf { (w, h) -> 
            if (w > h) w else h
        }
        
        var min = 0
        
        sizes.forEach { (w, h) -> 
            min = Math.max(min, Math.min(w, h))
        }
        
        return max * min
    }
}