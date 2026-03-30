class Solution {
    fun solution(my_string: String): Int {
        val list = my_string.split(" ")
        var answer: Int = list[0].toInt()
        
        for (i in 1 until list.size step 2) {
            if(list[i] == "-") {
                answer -= list[i + 1].toInt()
            } else {
                answer += list[i + 1].toInt()
            }
        }
        
        return answer
    }
}