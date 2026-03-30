class Solution {
    fun solution(numbers: String): Long {
         var answer = ""
        var remain = numbers
        while (remain != "") {
            remain = when(remain[0]) {
                'z' -> {
                    answer += '0'
                    remain.removePrefix("zero")
                }
                'o' -> {
                    answer += '1'
                    remain.removePrefix("one")
                }
                't' -> {
                    when (remain[1]) {
                        'w' -> {
                            answer += '2'
                            remain.removePrefix("two")
                        }
                        'h' -> {
                            answer += '3'
                            remain.removePrefix("three")
                        }
                        else -> { "" }
                    }
                }
                'f' -> {
                    when (remain[1]) {
                        'o' -> {
                            answer += '4'
                            remain.removePrefix("four")
                        }
                        'i' -> {
                            answer += '5'
                            remain.removePrefix("five")
                        }
                        else -> { "" }
                    }
                }
                's' -> {
                    when (remain[1]) {
                        'i' -> {
                            answer += '6'
                            remain.removePrefix("six")
                        }
                        'e' -> {
                            answer += '7'
                            remain.removePrefix("seven")
                        }
                        else -> { "" }
                    }
                }
                'e' -> {
                    answer += '8'
                    remain.removePrefix("eight")
                }
                'n' -> {
                    answer += '9'
                    remain.removePrefix("nine")
                }

                else -> { "" }
            }
        }
        return answer.toLong()
    }
}