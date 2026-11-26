class Package(val numPack: String, locationNow: String){
    var countMovements: Int = 0
        private set
    var location: String = locationNow
        set(value) {
            if(location.isNotBlank()){
                field = value
                countMovements++
            }
        }
}
fun main(){
    val pack = Package("6A8", "Симферополь")
    pack.location = "Севастополь"
    println(pack.location)
    println(pack.countMovements)
}