fun main(args: Array<String>){
    var number = 0
    var foreignString = "token"
    print("enter a number between 1 and 10")
    number = readln()!!.toInt()
    when (number){
        1 -> foreignString = "wa'"
        2-> foreignString = "cha'"
        3-> foreignString = "wej"
        4-> foreignString = "loS"
        5-> foreignString = "vagh"
        6-> foreignString = "jav"
        7-> foreignString = "Soch"
        8-> foreignString = "chorgh"
        9-> foreignString = "Hut"
        10-> foreignString = "wa'maH"
        !in 1..10 -> foreignString = "Please try again"
        else -> foreignString = "Hoch DaghajnIS" }
    println("Klingon $number")
    println("$foreignString")
}
//Thank you https://www.languagesandnumbers.com/ and https://www.translate.com/english-klingon for the klingon translations!