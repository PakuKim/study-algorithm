class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        
        var left = 10
        var right = 12
        for (i in 0 until numbers.size) {
            val num = if (numbers[i] == 0) 11 else numbers[i]
            
            val leftDiff = Math.abs(left - num).run {
                       (this % 3) + (this / 3)
                   }
                   val rightDiff = Math.abs(right - num).run {
                       (this % 3) + (this / 3)
                   }
                   
                   if (leftDiff == rightDiff) {
                       if (hand == "right") {
                           right = num
                           answer += "R"
                       } else {
                           left = num
                           answer += "L"
                       }
                   } else if (leftDiff < rightDiff) {
                       left = num
                       answer += "L"
                   } else {
                       right = num
                       answer += "R"
                   }
        }
        
        return answer
    }
}