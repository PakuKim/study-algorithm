class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3)
    }
}