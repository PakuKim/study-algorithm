fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    repeat(b) {
        println(
            buildString {
                repeat(a) {
                    append("*")
                }
            }
        )
    }
}