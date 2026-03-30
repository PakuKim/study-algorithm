class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        
        var newArr = arr
        while(true) {
            val temp = newArr.map {
                if (it >= 50 && it % 2 == 0) {
                    it / 2
                } else if (it < 50 && it % 2 == 1) {
                    it * 2 + 1
                } else {
                    it
                }
            }.toIntArray()
            
            if (newArr.sum() === temp.sum()) break
            else newArr = temp
            
            answer++
        }
        
        return answer
    }
}