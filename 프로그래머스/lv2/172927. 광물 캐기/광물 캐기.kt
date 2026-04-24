class Solution {
    data class Section(
        var diamond: Int = 0,
        var iron: Int = 0,
        var stone: Int = 0
    )
    
    fun solution(picks: IntArray, minerals: Array<String>): Int {
        var answer = 0
        val limit = minOf(minerals.size, picks.sum() * 5)
        val sections = mutableListOf<Section>()
        
        for (i in minerals.indices step 5) {
            val section = Section()
            for (j in i until minOf(i + 5, limit)) {
                when (minerals[j]) {
                    "diamond" -> section.diamond++
                    "iron" -> section.iron++
                    "stone" -> section.stone++
                }
            }
            sections.add(section)
        }
        
        sections.sortWith(
            compareByDescending<Section> { it.diamond }
                .thenByDescending { it.iron }
                .thenByDescending { it.stone }
        )
        
        for (section in sections) {
            when {
                picks[0] > 0 -> {
                    picks[0]--
                    answer += section.diamond + section.iron + section.stone
                }

                picks[1] > 0 -> {
                    picks[1]--
                    answer += section.diamond * 5 + section.iron + section.stone
                }

                picks[2] > 0 -> {
                    picks[2]--
                    answer += section.diamond * 25 + section.iron * 5 + section.stone
                }
            }
        }
        
        return answer
    }
}