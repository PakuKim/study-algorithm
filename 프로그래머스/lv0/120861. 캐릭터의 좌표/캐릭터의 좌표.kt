class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = IntArray(2)
        val xMax = board[0] / 2
        val yMax = board[1] / 2

        keyinput.forEach { key ->
            when(key) {
                "left" -> { if (answer[0] != -xMax) answer[0]-- }
                "right" -> { if (answer[0] != xMax) answer[0]++ }
                "up" -> { if (answer[1] != yMax) answer[1]++ }
                "down" -> { if (answer[1] != -yMax) answer[1]-- }
            }
        }
        
        return answer
    }
}