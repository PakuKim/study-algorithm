class Solution {
    fun solution(n: Int): Int {
    var i = 1
    var fact = 1

    while (fact * (i + 1) <= n) { // i+1의 팩토리얼이 n을 초과하는지 확인
        i++
        fact *= i
    }

    return i
}
}