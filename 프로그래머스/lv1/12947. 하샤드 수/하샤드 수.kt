class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        return x.toString().toList().sumOf { it.digitToInt() }.let {
            if (x % it == 0) true  
            else false
        }
    }
}