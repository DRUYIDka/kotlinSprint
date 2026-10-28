interface Flying {
    fun flight(): String
}

interface Swimmable {
    fun swim(): String
}

class Crucian(val name: String) : Swimmable {
    override fun swim(): String = "$name плавает"
}

class Seagull(val name: String) : Flying {
    override fun flight(): String = "$name летает"
}

class Duck(val name: String) : Flying, Swimmable {
    override fun flight(): String = "$name летает"
    override fun swim(): String = "$name плавает"
}

fun main() {
    val duck = Duck("Утка")
    val seagull = Seagull("Чайка")
    val crucian = Crucian("Карась")

    println(duck.flight())
    println(duck.swim())
    println(seagull.flight())
    println(crucian.swim())

}