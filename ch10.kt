import java.io.File
const val  TAVERN_NAME = "Taerny's Folly"
var playerGold = 10
var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")
val uniquePatrons = mutableSetOf<String>()
val menuList = File("data/tavern-menu-items.txt")
    .readText()
    .split("\r\n")

fun main() {
    println("*** Welcome to $TAVERN_NAME ***")
    menuList.forEachIndexed{ index, data ->
        val (type,name,price) = data.split(',')
        val distantOfspace = 12-type.length/2
        for(i in 1..distantOfspace){
            print(" ")
        }
        println("~[$type]~")
        val lenOfdot = 32 - name.length-price.length
        print("$index, $name")
        for(i in 1..lenOfdot){
            print('.')}
            print("$price\n")
        println("")
        }
    }