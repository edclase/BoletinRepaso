package esq.dam
//Currencies 1€ is
val dollar : Double = 1.16
val pound = 0.84
val yen = 132.5
fun main() {
    println("Introduce la cantidad en Euros: ")

    var qty = readln()

    val dollars = qty.toDouble() * dollar
    val pounds = qty.toDouble() * pound
    val yen = qty.toDouble() * yen
    println("Dolares: $dollars  Pounds: $pounds  Yen: $yen")

}