package esq.dam

fun main(){
    println("Primer valor decimal: ")
    var a = readln().toDouble()
    println("Segundo valor decimal: ")
    var b = readln().toDouble()
    println("Tercer valor decimal: ")
    var c = readln().toDouble()
    println("Cuarto valor decimal: ")
    var d = readln().toDouble()
    var first = firstOp(a, b, c, d)
    var second = secOp(a, b)
    var third = thirdOp(a, b, c, d)
    var fourth = fourthOp(a, b, c, d)
    var fifth = fifthOp(a, b, c, d)
    println("$first - $second - $third - $fourth - $fifth ")
}

fun firstOp(a: Double, b: Double, c: Double, d: Double): Double = (a * a) + (b * b) - (c/d)
fun secOp(a: Double, b: Double): Boolean = a > b
fun thirdOp(a: Double, b: Double, c: Double, d: Double) : Boolean = a - b <= c-d
fun fourthOp(a: Double, b: Double, c: Double, d: Double): Boolean = a<b && c<d || a+b>c-d
fun fifthOp(a: Double, b: Double, c: Double, d : Double): Boolean = a+b<b*(c-a)