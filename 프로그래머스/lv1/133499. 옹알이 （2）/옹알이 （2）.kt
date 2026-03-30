class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val words = arrayOf("aya", "ye", "woo", "ma")
        
        for (i in 0 until babbling.size) {
            var says = babbling[i]
            var last = ""
            while(true) {
                words.forEach { word ->
                    if (says.startsWith(word) && last != word) {
                        babbling[i] = says.replaceFirst(word, "")
                        last = word
                    }
                }
                
                if (says.equals(babbling[i])) break
                says = babbling[i]
            }
            if (says.isEmpty()) answer++
        }
        return answer
    }
}