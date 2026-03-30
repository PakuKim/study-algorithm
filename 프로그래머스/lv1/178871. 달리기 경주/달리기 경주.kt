class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val places = HashMap<String, Int>().apply {
            putAll(players.mapIndexed { i, p -> p to i})
        }

        for (i in callings) {
            val place = places[i] ?: continue

            places[i] = place - 1
            places[players[place - 1]] = place

            val front = players[place - 1]

            players[place - 1] = i
            players[place] = front
        }

        return players
    }
}