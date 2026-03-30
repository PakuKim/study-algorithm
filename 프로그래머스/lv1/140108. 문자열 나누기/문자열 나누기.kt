class Solution {
    fun solution(s: String): Int {
        var answer = 0
        var word = s
        var letterCount = 1
        var alpCount = 0
        
        while(word.isNotEmpty()) {
            if (word.length <= 1 || letterCount >= 2) {
                answer++
                break
            }
            
            val letter = word[0]
            for (i in 1 until word.length) {
                val alp = word[i]
                if (alp == letter) {
                    letterCount++
                } else {
                    alpCount++
                }
                if (letterCount == alpCount) {
                    answer++
                    word = word.drop(letterCount + alpCount)
                    letterCount = 1
                    alpCount = 0
                    break
                }
            } 
        }
        
        return answer
    }
}