class Solution {
    var answer = arrayOf<IntArray>()
    
    fun solution(n: Int): Array<IntArray> {
        recur(n, 1, 2, 3)
        
        return answer
    }
    
    fun recur(n: Int, from: Int, stop: Int, to: Int) {
        if (n == 1) {
            print(from, to)
            return
        }
        
        recur(n - 1, from, to, stop)
        
        print(from, to)
        
        recur(n - 1, stop, from, to)
    }
    
    fun print(a: Int, b: Int) {
        answer += intArrayOf(a,b)
    }
}