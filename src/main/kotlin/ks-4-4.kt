fun main() {
    val trainingDay = 6
    val isEvenDay: Boolean = trainingDay % 2 == 0
    val flagTraining: Boolean = true
    val finalString: String

    if(!isEvenDay)
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
