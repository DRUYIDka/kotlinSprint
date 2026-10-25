open class CelestialBody(val name: String, val hasAtmosphere: Boolean, val isSuitableForLanding: Boolean)
class Planet(name: String, isHasAtmosphere: Boolean, isSuitableForLanding: Boolean, val satellites: List<Satellite>):CelestialBody(name, isHasAtmosphere, isSuitableForLanding)
class Satellite(name: String, isHasAtmosphere: Boolean, isSuitableForLanding: Boolean,):CelestialBody(name, isHasAtmosphere, isSuitableForLanding)

fun main(){
    val planetEarth = Planet("Earth", true, true,mutableListOf(Satellite("Moon", false, true), Satellite("Спутник-1", false, false)))
    println("${planetEarth.name} ${planetEarth.satellites.joinToString { satellite -> satellite.name }}")
}