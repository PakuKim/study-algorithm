class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        var diff = common[1] - common[0]
        var isSequence = false
        
        (0..common.lastIndex - 1).forEach {
            val now = common[it]
            val next = common[it + 1]
            
            if (diff == next - now) {
                isSequence = true
                diff = next - now
            } else {
                isSequence = false
                diff = next / now
            }
        }
        
        return if(isSequence) common.last() + diff else common.last() * diff
    }
}