abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double {
        return (Math.PI * (radius * radius))
    }

    override fun perimeter(): Double {
        return (2 * radius * Math.PI)
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return (width * height)
    }

    override fun perimeter(): Double {
        return (2 * (width + height))
    }
}

fun main() {
    val listFigure: MutableList<Figure> = mutableListOf()
    val blackRectangle = Rectangle("чёрный", 6.0, 7.0)
    listFigure.add(blackRectangle)
    val whiteRectangle = Rectangle("белый", 10.9, 4.6)
    listFigure.add(whiteRectangle)
    val blackCircle = Circle("чёрный", 8.7)
    listFigure.add(blackCircle)
    val whiteCircle = Circle("белый", 9.8)
    listFigure.add(whiteCircle)
    val blackFigureList = listFigure.filter { it.color == "чёрный" }.sumOf { it.perimeter() }
    val whiteFigureList = listFigure.filter{it.color == "белый"}.sumOf { it.area()  }
    println(blackFigureList)
    println(whiteFigureList)
}