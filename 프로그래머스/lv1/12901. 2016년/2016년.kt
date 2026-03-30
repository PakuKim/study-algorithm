class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = 0
        val months = listOf(31,29,31,30,31,30,31,31,30,31,30,31)
        
        answer = (months.slice(0 until a - 1).sum() + b) % 7
        
        return when(answer) {
            1 -> "FRI"
            2 -> "SAT"
            3 -> "SUN"
            4 -> "MON"
            5 -> "TUE"
            6 -> "WED"
            0 -> "THU"
            else -> ""
        }
    }
}