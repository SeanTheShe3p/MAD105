fun main(args: Array<String>) {
    var myByte: Byte = 107 // 8-bit number -128 to 127
    var myShort: Short = 30000 // a 16-bit number
    var myInt = 16 // a 32-bit integer
    var myLong = 80000000L // double the bits of an int, 64-bit
    var myFloat = 3.14F // an integer with decimals
    var myDouble:Double = 160000000.0 // a 64-bit float
    var myBoolean = false // true or false variable
    myBoolean = myDouble<myLong&&myShort>myInt
    var myChar:Char = 'a'
    println(myBoolean)
    println(myByte)
    println(myShort)
    println(myInt)
    println(myLong)
    println(myFloat)
    println(myDouble)
}