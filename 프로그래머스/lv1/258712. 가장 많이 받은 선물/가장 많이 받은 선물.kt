class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val answer = IntArray(friends.size) { 0 }
        val chart = friends.associateWith { 
            friends.toMutableList().apply { remove(it) }
                .associateWith { 0 }.toMutableMap() 
        }
        val point = friends.associateWith { 0 }.toMutableMap()

        for (gift in gifts) {
            val (sender, receiver) = gift.split(" ")
            chart[sender]!![receiver] = chart[sender]!![receiver]!! + 1
            point[sender] = point[sender]!! + 1
            point[receiver] = point[receiver]!! - 1
        }
        
        chart.onEachIndexed { index, (sender, ch) ->
            ch.onEach { (receiver, gave) ->
                val received = chart[receiver]!![sender]!!
               
                if (gave > received) {
                    answer[index]++
                } else if (gave == received) {
                    if (point[sender]!! > point[receiver]!!) {
                        answer[index]++
                    }
                }
            }
        }
        
        return answer.maxOf { it }
    }
}