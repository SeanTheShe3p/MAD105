fun main(args: Array<String>){
    var counter = 0
    var userAns = "token"
    var ans1 = "true"
    var ans2 = "false"
    var ans3 = "true"
    var ans4 = "false"
    var ans5 = "true"
    var snappleFacts1 = "#1510: There are more trees on earth than stars in the milky way"
    var snappleFacts2 = "#1600: The longest alphabet has 74 letters"
    var snappleFacts3 = "#845: A lemon contains more sugar than a strawberry"
    var snappleFacts4 = "#1321: Alaska is the only state that can be typed on one row of keys"
    var snappleFacts5 = "#1324: In South Korea, a baby is considered 1 year old at birth"

    println("thank you for participating in the fun snapple quiz")
    println("all answers are in true/false format println lets see if you know your juice!")

    print("Question 1: Although mystical, there are less stars in the milky way than there are trees on earth.")
    userAns = readln()!!.toString()
    var results1 = ans1.compareTo(userAns, ignoreCase = true)
    if (results1 == 0){
        println()
        println("Yes, that's correct! $snappleFacts1.")
        println()
        counter++
    }else{
        println()
        println("No, $snappleFacts1.")
        println()}

    print("Question 2: The english alphabet is the longest alphabet at 26 letters.")
    userAns = readln()!!.toString()
    var results2 = ans2.compareTo(userAns, ignoreCase = true)
    if (results2 == 0){
        println()
        println("Yes, that's correct! $snappleFacts2.")
        println()
        counter++
    }else{
        println()
        println("No, $snappleFacts2.")
        println()}

    print("Question 3: Contrary to popular belief, the strawberry has less sugar than a lemon.")
    userAns = readln()!!.toString()
    var results3 = ans3.compareTo(userAns, ignoreCase = true)
    if (results3 == 0){
        println()
        println("Yes, that's correct! $snappleFacts3.")
        println()
        counter++
    }else{
        println()
        println("No, $snappleFacts3.")
        println()}

    print("Question 4: There are only 2 states that can be typed on a single keyboard row.")
    userAns = readln()!!.toString()
    var results4 = ans4.compareTo(userAns, ignoreCase = true)
    if (results4 == 0){
        println()
        println("Yes, that's correct! $snappleFacts4.")
        println()
        counter++
    }else{
        println()
        println("No, $snappleFacts4.")
        println()}

    print("Question 5: One year from your birthdate in America would make you 2 years old in South Korea.")
    userAns = readln()!!.toString()
    var results5 = ans5.compareTo(userAns, ignoreCase = true)
    if (results5 == 0){
        println()
        println("Yes, that's correct! $snappleFacts5.")
        println()
        counter++
    }else{
        println()
        println("No, $snappleFacts5.")
        println()}
    println()
    println()
    println("That's the end, thanks for playing! you scored $counter out of 5 possible aswers!")
}