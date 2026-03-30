class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = numbers
        
        return numbers.toMutableList().apply { 
            if(direction == "right") {
                add(0,this.removeLast())
            } else {
                add(this.lastIndex, this.removeFirst())
            }
        }.toIntArray()
    }
}