class User(login:String){
    private val passwordOriginal = "123456"

    fun checkPassword(passwordInput: String = readln()){
        if (passwordInput == passwordOriginal) println("Пароль введён верно")
        else println("Пароль введён неверно")
    }
}
fun main(){
    val user = User("Anya")
    user.checkPassword()
}