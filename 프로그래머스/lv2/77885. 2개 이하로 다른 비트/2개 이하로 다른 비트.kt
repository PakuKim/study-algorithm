class Solution {
    fun solution(numbers: LongArray): LongArray {
        print(7 or 11)
        return numbers.map { number ->
            if (number % 2 == 0L) {
                number + 1
            } else {
                number + ((number.inv() and (number + 1)) shr 1)
            }
        }.toLongArray()
    }
}