import java.time.LocalDate

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        val todayDate = today.split(".").let { (year, month, day) ->
            LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        }

        val termsMap = terms.associate {
            it.split(" ").let { it.first() to it.last() }
        }

        privacies.onEachIndexed { index, privacy ->
            val (key, value) = privacy.split(" ").let {
                it.last() to it.first()
            }
            
            val limit = termsMap[key] ?: return@onEachIndexed

            val availableDate = value.split(".").let { (year, month, day) ->
                LocalDate.of(year.toInt(), month.toInt(), day.toInt()).plusMonths(limit.toLong())
            }
            
            if (todayDate >= availableDate) answer += (index + 1)
        }

        return answer
    }
}