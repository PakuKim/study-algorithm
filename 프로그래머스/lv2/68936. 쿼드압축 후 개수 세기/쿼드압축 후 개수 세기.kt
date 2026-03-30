class Solution {
fun solution(arr: Array<IntArray>): IntArray {
    recur(arr)

    return answer
}

val answer: IntArray = IntArray(2)
fun recur(arr: Array<IntArray>) {
    val standard = check(arr)

    if (standard >= 0) {
        answer[standard]++
        return
    }

    val limit = arr.size / 2

    recur(zip(arr, 0, 0))
    recur(zip(arr, limit, 0))
    recur(zip(arr, 0, limit))
    recur(zip(arr, limit, limit))
}

fun zip(arr: Array<IntArray>, cl: Int, rl: Int): Array<IntArray> {
    val size = arr.size / 2
    val arrZip = Array<IntArray>(size) { IntArray(size) }

    repeat(size) { c ->
        repeat(size) { r ->
            arrZip[c][r] = arr[c + cl][r + rl]
        }
    }
    
    return arrZip
}

fun check(arr: Array<IntArray>): Int {
    val standard = arr.first().first()
    val size = arr.size

    repeat(size) { c ->
        repeat(size) { r ->
            if (standard != arr[c][r]) return -1
        }
    }

    return standard
}
}