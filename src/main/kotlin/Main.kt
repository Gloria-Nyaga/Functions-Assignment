fun main(){


    println("Hello $(Gloria)")
    sum(55,4,56,60)
    modulus(77,31)
    println ("I love the fact that when I am true to myself")
}

fun printHello (greeting: String){
    println(greeting)

}
fun modulus(num1:Int,num2:Int,): Int {
    var modulus= num1 % num2
    println(modulus)
    return(modulus)

}
fun sum( a: Int,b: Int,c:Int,d:Int): Int{
      var sum = a+b+c+d
    println(sum)
    return(sum)

}

fun print(funFact: String) {
    println(funFact)


}