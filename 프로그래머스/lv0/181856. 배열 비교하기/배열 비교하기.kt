class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        
        answer = if(arr1.size > arr2.size) {
            1
        } else if(arr2.size > arr1.size) {
            -1
        } else {
            val a = arr1.sum()
            val b = arr2.sum()
            
            if(a > b) {
                1
            } else if(b > a) {
                -1
            } else {
                0
            }
        }
        
        return answer
    }
}