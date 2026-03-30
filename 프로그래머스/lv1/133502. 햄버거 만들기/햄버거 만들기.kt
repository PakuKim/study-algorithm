class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val sb = StringBuilder()
        for(item in ingredient) {
            sb.append(item)
            if(sb.substring(sb.length-4) == "1231") {
                sb.setLength(sb.length-4)
                answer++
            }
        }
        return answer
    }
}