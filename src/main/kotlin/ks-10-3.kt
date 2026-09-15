fun main() {
    println("Введите количество символов в пароле")
    val lengthInput = readln().toInt()
    val chars = "!#$%&'()*+,-./\"\" "
    val digit = "01234567889"

    println(generationPassword(lengthInput, chars, digit))
}

fun generationPassword(length: Int, chars: String, digit: String): String {
    var password = ""
        while (password.length != length){
            password += chars.random()
            if (password.length != length) password += digit.random()
        }

    return password
}