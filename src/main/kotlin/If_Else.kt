fun main(args: Array<String>) {
    var reg_temp = 98.5F
    var user_temp = 0.0F
    var temp_dif = 0.0F
    while(user_temp != reg_temp){
        println("Please enter the patient's temperature: ")
        user_temp = readln()!!.toFloat()
        temp_dif = user_temp - reg_temp
        if (temp_dif<=1 && temp_dif>=-1)
            println("The patient is healthy")
        else if (temp_dif>1)
            println("The patient is too hot")
        else if (temp_dif<-1)
            println("The patient is too cold")
    }
}