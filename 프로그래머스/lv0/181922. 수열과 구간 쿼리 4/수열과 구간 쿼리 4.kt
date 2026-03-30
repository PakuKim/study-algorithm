class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        for (query in queries) {
            for (i in 0 until answer.size) {
                if (i >= query[0] && i <= query[1] && i % query[2] == 0) {
                    answer[i]++
                }
            }
        }
        return answer
    }
    //1 % 1 == 0
    //1 % 2 == 1
    //1 % 3 == 1
    
    //2 % 1 =  0
    //2 % 2 == 0
    //2 % 3 == 2
    
    //4 . 1,2,3
}