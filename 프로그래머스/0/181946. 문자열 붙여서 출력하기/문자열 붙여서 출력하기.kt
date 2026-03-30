fun main(args: Array<String>) {
		val input = readLine()!!.split(' ')
    val s1 = input[0].removePrefix(" ")
    val s2 = input[1].removePrefix(" ")
    print(s1 + s2)
}