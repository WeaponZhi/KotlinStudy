package net.println.kotlin

/**
 * Created by pc on 2017/7/10.
 */
val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

fun main(args: Array<String>) {
    println(string == fromChars)//相当于 equals
    println(string === fromChars)//相当于 Java 的 ==

    println("接下来我们要输出：" + string)

    val arg1: Int = 0
    val arg2: Int = 1
    println(""+arg1 + " + " + arg2 + " = " + (arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    //Hello "Trump"
    val sayHello:String="Hello \"Trump\""
    println(sayHello)
    //$salary
    val salary:Int = 1000
    println("\$salary")

    val rawString:String = """
        \t
        \n
$ salary
    """
    println(rawString)
    println(rawString.length)
}