package esq.dam

import kotlin.math.pow

fun main(){
    var userRadius = readln().toDouble()
    val pi : Double = 3.14159265358979
    var pmt = (2 * pi * userRadius)
    var area = (pi * userRadius.pow(2) )
    var vol =  (4/3) * pi * userRadius.pow(3)

    println("$area - $pmt - $vol ")
}

