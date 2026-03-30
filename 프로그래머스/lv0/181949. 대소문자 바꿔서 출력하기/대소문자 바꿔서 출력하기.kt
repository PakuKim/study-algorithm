fun main(args: Array<String>) {
    val s1 = readLine()!!
    buildString {
           s1.map {
            if (it.isUpperCase()) {
                append(it.lowercaseChar())
            } else {
                append(it.uppercase())
            }
        }
    }.also { 
            print(it)
        }
     
}