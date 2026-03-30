class Solution {
    fun solution(n: Int): IntArray {
        var answer: Set<Int> = setOf()
        
        var count = n
        for(i in 2 until count + 1) {
			while(count % i == 0) {
				answer += i
				count /= i
			}
		}
        
        return answer.toIntArray()
    }
}