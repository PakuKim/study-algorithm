class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer = IntArray(2)
        
        var map = Array(park.size) { BooleanArray(park[0].length) }
        val maxY = park.size - 1
        val maxX = park[0].length - 1
        
        for (i in park.indices) {
            for (j in park[i].indices) {
                val syntax = park[i][j]
                
                if (syntax == 'O') {
                    map[i][j] = true
                } else if (syntax == 'S') {
                    answer[0] = i
                    answer[1] = j
                    map[i][j] = true
                }
            }
        }
        
        routes.forEach {
            val (direction, moveString) = it.split(" ").let { it.first() to it.last() }
            
            val move = moveString.toInt()
            val y = answer[0]
            val x = answer[1]

            when(direction) {
                "E" -> {
                    if ((x + move) > maxX) return@forEach
                    if (map[y].slice(x .. (x + move)).contains(false)) return@forEach

                    answer[1] = x + move
                }
                "W" -> {
                    if ((x - move) < 0) return@forEach
                    if (map[y].slice(x downTo (x - move)).contains(false)) return@forEach

                    answer[1] = x - move
                }
                "S" -> {
                    if ((y + move) > maxY) return@forEach
                    if (map.map { it[x] }.slice(y .. (y + move)).contains(false)) return@forEach

                    answer[0] = y + move
                }
                "N" -> {
                    if ((y - move) < 0) return@forEach
                    if (map.map { it[x] }.slice(y downTo (y - move)).contains(false)) return@forEach

                    answer[0] = y - move
                }
            }
        }
        
        return answer
    }
}