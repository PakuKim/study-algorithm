class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        return num.toString().indexOf("$k").let {
            if (it >= 0) it + 1
            else it
        }
    }
}