fun main() {
    val trainingDay = 5
    val flagTraining: Boolean = true
    var finalString: String

    if(trainingDay <= 5)
        finalString = "Упражнения для рук:\t\t$flagTraining\n" +
                "Упражнения для ног:\t\t${!flagTraining}\n" +
                "Упражнения для спины:\t${!flagTraining}\n" +
                "Упражнения для пресса:\t$flagTraining";
    else
        finalString = "Упражнения для рук:\t\t${!flagTraining}\n" +
                "Упражнения для ног:\t\t$flagTraining\n" +
                "Упражнения для спины:\t$flagTraining\n" +
                "Упражнения для пресса:\t${!flagTraining}";
    println(finalString)
}
