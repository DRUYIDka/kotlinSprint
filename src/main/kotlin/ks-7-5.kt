fun main() {
    val char = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val lengthPassword = readln().toInt()
    var pin = ""

    for (i in 1..lengthPassword) {
        if(char.uppercase() in char && char.lowercase() in char)
            pin += char.random()
        else
            pin += char.random()
    }
    println(pin)
}