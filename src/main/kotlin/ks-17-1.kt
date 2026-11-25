class quiz(questionInput: String, answerInput: String){
    val question = questionInput
        get() = field
    var answer = answerInput
        get() = field
        set(value){
            field = value
        }
}