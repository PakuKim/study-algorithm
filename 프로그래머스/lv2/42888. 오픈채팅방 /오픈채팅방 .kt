class Solution {
    fun solution(record: Array<String>): Array<String> {
        val user = hashMapOf<String, String>()
        
        return record.map {
            val docs = it.split(" ")
            val type = docs.first()
            if (type == "Enter" || type == "Change") {
                user[docs[1]] = docs[2]
            }
            
            translate(type, user[docs[1]]!!)
        }.filter { it.isEmpty() }.toTypedArray()
    }
    
    fun translate(type: String, name: String): String {
        return when(type) {
            "Enter" -> "${name}님이 들어왔습니다."
            "Leave" -> "${name}님이 나갔습니다."
            else -> ""
        }
    }
}