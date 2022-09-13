fun addInfo(name: String, phone: String):String{
    return ("The residents info \n Name: $name \n Phone: $phone \n")
}
fun addInfo(name: String, contact: String, phone:String):String{
    return ("The business info \n Name: $name \n Contact: $contact \n Phone:$phone")
}
fun main() {
    var userChoice = 3
    while (userChoice != 0){
        println("Select 1 for resident 2 for business. zero to cancel")
        userChoice = readln()!!.toInt()
        if (userChoice == 1){
            println("Resident")
            println("Enter name")
            var name = readln()!!.toString()
            println("Enter phone number")
            var phone = readln()!!.toString()
            println(addInfo(name, phone))}
        else if (userChoice == 2){
            println("Business")
            println("Enter name")
            var name = readln()!!.toString()
            println("Enter contact")
            var contact = readln()!!.toString()
            println("Enter phone number")
            var phone = readln()!!.toString()
            println(addInfo(name, contact, phone))}
        else{
            userChoice == 0
        }
    }
}