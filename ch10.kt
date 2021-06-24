import kotlin.math.roundToInt
import java.io.File
const val  TAVERN_NAME = "Taerny's Folly"

var playerGold = 10
var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")
val menuList = File("data/tavern-menu-items.txt")
    .readText()
    .split("\r\n")

fun main() {
    (0..9).forEach{
        val first = patronList.shuffled().first()
        val last = lastName.shuffled().first()
        val name = "$first $last"
        println(name)
    }
}