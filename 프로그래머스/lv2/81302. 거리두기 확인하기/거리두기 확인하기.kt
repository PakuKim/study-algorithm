class Solution {
    fun solution(places: Array<Array<String>>): IntArray {
        val answer = IntArray(5)
        for ((i, place) in places.withIndex()) {
            answer[i] = checkPlace(place)
        }

        return answer
    }

    fun checkPlace(place: Array<String>): Int {
        val seats = mutableListOf<Pair<Int, Int>>()
        for (row in place.indices) {
            for (col in place[row].indices) {
                if (place[row][col] == 'P') {
                    if (!checkSeat(row, col, seats, place)) return 0
                    seats.add(row to col)
                }
            }
        }

        return 1
    }

    fun checkSeat(r1: Int, c1: Int, seats: List<Pair<Int, Int>>, place: Array<String>): Boolean {
        for ((r2, c2) in seats) {
            val distance = calc(r1, c1, r2, c2)
            when {
                distance > 2 -> continue
                distance <= 1 -> return false
                !checkPartition(r1, c1, r2, c2, place) -> return false
            }
        }
        return true
    }

    fun checkPartition(r1: Int, c1: Int, r2: Int, c2: Int, place: Array<String>): Boolean {
        return when {
            r1 == r2 -> place[r1][(c1 + c2) / 2] == 'X'
            c1 == c2 -> place[(r1 + r2) / 2][c1] == 'X'
            else -> place[r1][c2] == 'X' && place[r2][c1] == 'X'
        }
    }

    fun calc(r1: Int, c1: Int, r2: Int, c2: Int): Int {
        return Math.abs(r2 - r1) + Math.abs(c2 - c1)
    }
}