class Player private constructor(nameInput: String, hitInput: Int, healthInput: Int) {
    var hit = hitInput
        private set
    private val name = nameInput
    var health = healthInput
        private set
    var isAlive = true
        private set

    companion object {
        fun create(nameInput: String, hitInput: Int, healthInput: Int): Player {
            require(hitInput > 0) { "Сила удара не может быть меньше или равна 0" }
            require(healthInput > 0) { "Здоровье не может быть меньше или равным 0" }
            require(nameInput.isNotBlank()) { "Имя не может быть пустым" }

            return Player(nameInput, hitInput, healthInput)
        }
    }
    fun damageTaking() {
        if (isAlive) {
            if (health <= hit) {
                endGame()
            }
            else  health -= hit
        }
    }

    fun healing(medicament: Int) {
        require(medicament > 0) {"Лечение должно быть больше 0"}
        if (isAlive) health += medicament

    }

    private fun endGame() {
        isAlive = false
        hit = 0
        health = 0
        println("Игрок мёртв")
        println("Здоровье: $health\n" +
                "Удар: $hit")
    }
}

fun main() {
    val player = Player.create("user", 10, 35)
    player.damageTaking()
    player.healing(10)
    player.damageTaking()
    player.damageTaking()
    player.damageTaking()
    player.damageTaking()
    player.healing(10)
}