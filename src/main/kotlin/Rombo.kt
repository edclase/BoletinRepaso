package esq.dam

fun main(){
    draw()
}

fun draw(){
    println("Introduce numero entero: ")
    val input = readLine()!!.toInt()
    for (i in 1..input) {
        println("*".repeat(i))
    }
    for (i in input downTo 1) {
        println("*".repeat(i))
    }

}