
fun areaTriangle(w: Float, h: Float): Float{
    return  (w*h)/2
}

fun areaRectangle(w: Float, h: Float): Float{
    return w * h
}

fun areaCircle(r: Float, p:Float): Float{
    return p * (r*r)
}

fun areaTrapezoid(a: Float, b: Float, h: Float): Float{
    return ((a+b)/2) * h
}

fun main(){
    var userChoice = 5
    while (userChoice != 0){e
        println("1. Triangle")
        println("2. Rectangle")
        println("3. Circle")
        println("4. Trapezoid")
        println("What shape would you want to figure the area of? zero to cancel")
        userChoice = readln()!!.toInt()
        if (userChoice == 1){
            println("Triangle")
            println("Enter width")
            val w = readln()!!.toFloat()
            println("Enter height")
            val h = readln()!!.toFloat()
            val area = areaTriangle(w, h)

            println("The area of the triangle is $area squared units.")
            println()}
        else if (userChoice == 2){
            println("Rectangle")
            println("Enter width")
            val w = readln()!!.toFloat()
            println("Enter height")
            val h = readln()!!.toFloat()
            val area = areaRectangle(w, h)

            println("The area of the rectangle is $area squared units.")
            println()}
        else if (userChoice == 3){
            println("Circle")
            println("Enter radius")
            val r = readln()!!.toFloat()
            println("Enter pi")
            val p = readln()!!.toFloat()
            val area = areaCircle(r, p)

            println("The area of the circle is $area squared units.")
            println()}
        else if (userChoice == 4){
            println("Trapezoid")
            println("Enter width 'A'")
            val a = readln()!!.toFloat()
            println("Enter the width 'b'")
            val b = readln()!!.toFloat()
            println("Enter the height")
            val h = readln()!!.toFloat()
            val area = areaTrapezoid(a, b, h)

            println("The area of the trapezoid is $area squared units.")
            println() }
        else{
            userChoice==0
        }
    }
}