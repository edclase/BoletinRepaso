package esq.dam

fun main() {
    //countA()
    //removeVowels()
    //countVowels()
}

fun countA() {
    val input = readLine()!!.lowercase()
    var aCount = 0
    input.forEach { char -> if (char == 'a') aCount++ }
    println("$input contiene $aCount 'A'")

}

fun removeVowels() {
    println("Introduce una palabra: ")
    val input = readLine()!!.lowercase()
    val removed = input.replace(Regex("[aeiou]"), "")
    println(removed)
}

fun countVowels() {
    val input = readLine()!!.lowercase()
    var vowelCount = 0
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u')
    input.forEach { char ->
        vowels.forEach { vowel ->
            if (vowel == char) {
                vowelCount++
            }
        }

    }
    println("$input contiene $vowelCount")
}
