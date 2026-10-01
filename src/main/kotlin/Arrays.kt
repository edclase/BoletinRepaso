package esq.dam

fun main() {
    //mayorMenor()
    //arrayPersonalizado()
    //aleatorios()
    aleatoriosplus()
}

fun mayorMenor() {
    var array = IntArray(10)
    var max = 0
    var min = 0
    for (i in 0..9) {
        println("Introduce ${i + 1} numero")
        val input = readln().toInt()
        array[i] = input
    }
    for (i in 0..9) {
        val current = array[i]
        println("Looking for max: $max - ${array[i]}")
        if (current >= max) {
            max = current
            println("Found max: $max")
        }
    }
    for (i in 0..9) {
        val current = array[i]
        println("Looking for min: $min - ${array[i]}")
        if (current <= min) {
            min = current
            println("Found min: $min")
        }
    }
    println("Max : $max - Min: $min")
    println(array.contentToString())
}

fun arrayPersonalizado() {
    var ready: Boolean = false
    var array : IntArray = IntArray(0)
    while (!ready) {
        println("Introduce un numero entre 3 y 8")
        val input = readln()
        if (input.toInt() >= 3 && input.toInt() <= 8) {
            array = IntArray(input.toInt())
            ready = true
        }
    }
    for (i in array.indices) {
        println("Numero para el indice: ${i+1}")
        array[i] = readLine()!!.toInt()
    }
    println(array.contentToString())
}
fun aleatorios() {
    val array = IntArray(49)
    for (i in array.indices) {
        array[i] = (1..20).random()
        println(array[i])
    }
    val input = readln().toInt()
    for (i in array.indices) {
        if (array[i] == input) {
            println("Encontrado: $input")
        }
    }
    println(array.contentToString())
}
fun aleatoriosplus() {
    val array = IntArray(49)
    val list = mutableListOf<Int>()
    for (i in array.indices) {
        array[i] = (1..20).random()
        println(array[i])
    }
    println("Introduce numero a buscar: ")
    val input = readln().toInt()
    for (i in array.indices) {
        if (array[i] == input) {
            println("Encontrado: $input")
            list.add(i)
        }
    }
    println(array.contentToString())
    println("Encontrado el numero: $input ${list.size} veces")
}
fun matriz3x3() {
    var matrix = arrayOf(
        intArrayOf(),
        intArrayOf(),
        intArrayOf()
    )
}
//fun matrizTamanos() {}
