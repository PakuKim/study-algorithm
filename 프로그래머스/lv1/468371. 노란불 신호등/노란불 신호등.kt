class Solution {
    fun solution(signals: Array<IntArray>): Int {
        val lights = signals.map { Triple(it[0], it[1], it[2]) }
        val cycles = lights.map { it.sum() }
        val maxCycle = cycles.reduce { acc, cur -> lcm(acc, cur) }
        
        for (time in 0 until maxCycle) {
            if (lights.all { isYellow(time, it) }) return (time + 1)
        }
        
        return -1
    }
    
    fun isYellow(time: Int, signal: Triple<Int,Int,Int>): Boolean {
        val (g, y, r) = signal
        val cycle = g + y + r
        val t = time % cycle
        
        return t in g until (g + y)
    }
    
    tailrec fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
    
    fun lcm(a: Int, b: Int): Int {
        return a / gcd(a, b) * b
    }
}