class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        
        val column = arr.size
        val row = arr[0].size
        
        return if (column > row) {
            arr.map { 
                it.copyOf(column)
            }.toTypedArray()
        } else if (row > column) {
             arr.copyOf(row).map { 
                it ?: IntArray(row)
            }.toTypedArray()
        } else {
            arr
        }
    }
}