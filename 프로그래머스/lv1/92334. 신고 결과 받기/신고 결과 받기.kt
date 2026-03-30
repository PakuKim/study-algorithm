class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = IntArray(id_list.size)
        val board = mutableMapOf<String, HashSet<String>>()
        
        report.forEach {
            val(a,b) = it.split(" ")
            board.computeIfAbsent(b) { hashSetOf() }.add(a)
        }
        
        val reported = board.filter { it.value.size >= k }.values

        for ((index, id) in id_list.withIndex()) {
            answer[index] = reported.count { it.contains(id) }
        }
        
        return answer
    }
}