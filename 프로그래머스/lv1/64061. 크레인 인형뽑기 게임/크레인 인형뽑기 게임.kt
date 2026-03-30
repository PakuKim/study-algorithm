import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        
        val basket = Stack<Int>()
        for (move in moves) {
            val index = board.map { it[move - 1] }.indexOfFirst { it != 0 }
        
            if (index != -1) {
                if (basket.isNotEmpty() && basket.peek() == board[index][move - 1]) {
                    answer++
                    basket.pop()
                } else {
                    basket.push(board[index][move - 1])
                }
                board[index][move - 1] = 0
            }
        }
        
        return answer * 2
    }
}