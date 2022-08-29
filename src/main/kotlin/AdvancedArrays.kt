fun main(args: Array<String>){
    var hotDog= arrayOf<String>("Buns", "Hot Dogs", "Ketchup", "Mustard", "Mayonnaise","Relish","Onion","Celery Salt","Sports","Napkins")
    var quantity= arrayOf<String>("100", "100", "1000", "1000", "1000", "250", "250", "1000000", "250", "10000")
    var run= 0
    var repeat= 0
    var userOpt= 1
    var searchValue= ""
    var results= 0
    var oldValue= 0
    var newValue= 0
    var listLength= 0
    var addSubtract= 0
    var changeValue=0
    var combArray = arrayOf<Array<String>>()
    combArray+= hotDog
    combArray+= quantity
    listLength= combArray[0].size-1
    while(run != 1) {
        while (repeat != 1) {
            for (r in 0..listLength) {
                println("you have " + (combArray[1][r]) + " units of " + (combArray[0][r]) + ".")
            }
            print("would you like to query a specific item? enter 'quit' to quit")
            searchValue = readln()!!.toString()
            if (searchValue != "quit") {
                for (r in 0..listLength) {
                    results = combArray[0][r].compareTo(searchValue, ignoreCase = true)
                    if (results == 0) {
                        println()
                        print("you searched " + searchValue + " , the current quantity on hand is " + combArray[1][r] + ". enter 0 to subtract, enter 1 to add.")
                        addSubtract = readln()!!.toInt()
                        if (addSubtract == 0) {
                            print("how many would you like to subtract?")
                            changeValue = readln()!!.toInt()
                            oldValue = combArray[1][r].toInt()
                            newValue = oldValue - changeValue
                            if (newValue <= 0) {
                                println("Error: That brings the quantity for " + combArray[0][r] + " below zero, order more!")
                                combArray[1][r] = "0"
                            } else {
                                combArray[1][r] = newValue.toString()
                            }
                        } else if (addSubtract == 1) {
                            print("how many would you like to add?")
                            changeValue = readln()!!.toInt()
                            oldValue = combArray[1][r].toInt()
                            newValue = oldValue + changeValue
                            combArray[1][r] = newValue.toString()
                        } else {
                            println("that was an invalid answer")
                        }
                    }
                }
            } else {
                repeat = 1
            }
        }
        println()
        print("quit and wipe data? enter 0 to quit, enter 1 to restart")
        userOpt = readln().toInt()
        if (userOpt == 0) {
            run = 1
        } else if (userOpt == 1){
            repeat=0
        }
}}