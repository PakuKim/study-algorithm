class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        return phone_number.mapIndexed { index, a -> 
            if (index < phone_number.length - 4) {
                "*"
            } else {
                a
            }
        }.joinToString("")
    }
}