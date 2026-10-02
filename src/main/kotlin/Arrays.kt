package esq.dam

fun main() {
    //mayorMenor()
    //arrayPersonalizado()
    //aleatorios()
    //aleatoriosplus()
    //matriz3x3()
    matrizTamanos()
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
        val input = readln().toInt()
        if (input in 2..8) {
            array = IntArray(input)
            ready = true
        } else {
            println("El numero $input no es valido")
        }
    }
    for (i in array.indices) {
        println("Numero para el indice: ${i+1}")
        array[i] = readln().toInt()
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
    var array = Array(4) {IntArray(4) {(0..9).random()} }
    array.forEach {
        println(it.contentToString())
    }
}
fun matrizTamanos() {
    println("Introduce un numero entre 2 y 5")
    val input = readln().toInt()

    if (input in 2..5) {
        println("Numero entre 2 y 5 $input")
    } else {
        println("El numero $input no es valido")
        matrizTamanos()
    }
    var array = Array(input)  {IntArray(input)}

    array.forEachIndexed { aindex, ar ->
        ar.forEachIndexed {
            bindex, value ->
            println("Valor $bindex de: $value x $aindex")
            array[aindex][bindex] = readln().toInt()

        }
    }
    array.forEach { println(it.contentToString()) }
}
