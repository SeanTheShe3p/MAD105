fun main(args: Array<String>) {
    var choice = 0
    do {
        println("Please select your starter pokemon")
        println("1.) Turtwig")
        println("2.) Piplup")
        println("3.) Chimchar")
        println("4.) Shinx")
        println("5.) Riolu")
        println("6.) Exit emulation")
        print("enter decision")
        choice = readln()!!.toInt()
        if (choice == 1){
            println("You have chosen Turtwig as your starter pokemon! congratulations!")} else if (choice==2){
            println("You have chosen Piplup as your starter pokemon! congratulations!")} else if (choice == 3){
            println("You have chosen Chimpchar as your starter pokemon! congratulations!")} else if (choice == 4){
            println("You have chosen Shinx as your starter pokemon! congratulations!")} else if (choice == 5){
            println("You have chosen Riolu as your starter pokemon! congratulations!")} else if (choice == 6){
            println("Exiting emulation")} else {
            println("you have seleceted an invalid entry, please try again")
            choice = 0}
    } while (choice != 6)
}