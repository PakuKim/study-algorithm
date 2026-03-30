class Solution {
    // private var z = ""

    
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var zeroCounter = 0
        var regexCounter = 0
        var list = s.toMutableList()
        while(list.size > 1) {
            while(list.contains('0')) {
                list.remove('0')
                zeroCounter++
            }
            list = Integer.toBinaryString(list.size).toMutableList()
            regexCounter++
        }
        answer = intArrayOf(regexCounter, zeroCounter)
        return answer
    }
    
    // private fun toRegex() {
    //     regexCounter++
    //     for(i in z.indices) {
    //         if(z.contains("0")) {
    //             z.replaceFirst("0", "")
    //             zeroCounter++
    //         }
    //     }
    //     z = Integer.toBinaryString(z.length)
    // }
}