import java.text.DecimalFormat

fun main(){
    val tax = .025F
    val tip = .175F
    var taxTotal = 0F
    var tipTotal = 0F
    var itemCost = 0F
    var subCost = 0F
    var totalCost = 0F
    var userChoice = 1

    println("Tip Calculator")
    while (userChoice !=0){
        println("Add item? 1 to add zero to compile total")
        userChoice = readln()!!.toInt()
        if (userChoice == 1){
            println("Enter item cost:")
            itemCost = readln()!!.toFloat()
            subCost += itemCost }}
    taxTotal = subCost*tax
    tipTotal = subCost*tip
    totalCost = subCost + tipTotal + taxTotal

    val dollarValue = DecimalFormat("\$###,###.00")
    var finalTax = dollarValue.format(taxTotal)
    var finalTip = dollarValue.format(tipTotal)
    var finalSub = dollarValue.format(subCost)
    var finalTotal = dollarValue.format(totalCost)

    println()
    println("Breakdown")
    println("SubTotal:"+finalSub+"\nTax:"+finalTax+"\nTip:"+finalTip+"\n_____________\nTotal:"+finalTotal)
}