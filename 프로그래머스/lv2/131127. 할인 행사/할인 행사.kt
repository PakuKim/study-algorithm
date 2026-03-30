class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        var day = 0
        
        while(discount.size - day >= 10) {
            val newList = discount.slice(day until day + 10)
            for (i in 0 until want.size) {
                val product = want[i]
                val num = number[i]
                
                if (newList.count {it == product} == num) {
                    if (i == want.size -1) answer++
                } else {
                    break
                }
            }
            
            day++
        }
        
        return answer
    }
}