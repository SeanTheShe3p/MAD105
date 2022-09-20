import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*
// var holdBirthday: LocalDate = LocalDate.of(year,birthMonth,birthDay)
fun main(){
    var nextFullMoon: LocalDate = LocalDate.of(2022,10,9)
    var lastFullMoon: LocalDate = LocalDate.of(2022,9,10)
    var todaysDate = LocalDate.now()
    val dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyy")
    val formattedToday = todaysDate.format(dateFormat)
    println("Today is $formattedToday")
    println("_________________________")
    var daysUntil = ChronoUnit.DAYS.between(todaysDate, nextFullMoon)
    var daysSince = ChronoUnit.DAYS.between(lastFullMoon, todaysDate)
    println("there is $daysUntil day(s) until the next full moon")
    println("the last full moon was $daysSince day(s) ago")
}