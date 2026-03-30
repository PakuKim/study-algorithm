class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var first = afterMatch(a)
        var second = afterMatch(b)
        for(i in 0 until n/2) {
            if(first == second) break
            first = afterMatch(first)
            second = afterMatch(second)
            answer++
        }
        return answer
    }
    fun afterMatch(num: Int): Int {
        return if(num % 2 == 0) {
            num / 2
        } else {
            (num + 1) / 2
        }
    }
}