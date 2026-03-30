class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { i ->
            IntArray(arr2[0].size) { j -> 
                arr1[i].indices.sumOf { k -> arr1[i][k] * arr2[k][j] }
            }
        }
    }
}