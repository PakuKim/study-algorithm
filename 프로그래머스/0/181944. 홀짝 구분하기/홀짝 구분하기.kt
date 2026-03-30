fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    
    val b = if(a % 2 == 0) "even" else "odd"
    
    print("${a} is $b")
}