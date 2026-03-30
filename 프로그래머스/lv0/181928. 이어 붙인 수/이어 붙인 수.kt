class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd = ""
        var even = ""
        
        for (n in num_list) {
            if (n % 2 == 0) even += n else odd += n
        }
        
        return (odd.toInt() + even.toInt())
    }
}