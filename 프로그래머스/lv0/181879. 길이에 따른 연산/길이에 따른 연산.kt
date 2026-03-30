class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        return num_list.let { list ->
            if(list.size > 10) {
                list.sum()
            } else {
                list.reduce { a,b -> a * b }
            }
        }
    }
}