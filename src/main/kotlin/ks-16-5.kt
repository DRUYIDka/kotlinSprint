class Player(nameInput: String, strongInput: Int, healthInput: Int) {
    var strong = strongInput
        private set
    val name = nameInput
    var healthInitially = healthInput
        private set

    fun damageTaking() {
        if (healthInitially > 0) healthInitially -= strong
        else if (healthInitially == 0) endGame()
    }

    fun healing(medicament: Int) {
        healthInitially += medicament
    }

    private fun endGame() {
        strong = 0
        healthInitially = 0
        println("Игрок мёртв")
    }
}

fun main() {
    val player = Player("user", 10, 30)
    player.damageTaking()
    player.healing(10)
    player.damageTaking()
    player.damageTaking()
    player.damageTaking()
    player.damageTaking()
}