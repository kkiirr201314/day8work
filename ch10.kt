import kotlin.math.roundToInt

const val  TAVERN_NAME = "Taerny's Folly"

var playerGold = 10
var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")

fun main() {
    println("顧客清單如右: $patronList")
    patronList.forEachIndexed { index, patron ->
        println("晚上好, $patron - 您排 #${index + 1} 號在隊伍中.")
        placeOrder(patron,"shandy ,Dragon's Breath, 5.91")
        println("------------------------------------------------")
    }
}


private  fun displayBalance() {
    println("玩家錢包餘額: Gold: $playerGold , Silver: $playerSilver")
}
private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")){
        when (it.value){
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            "A" -> "4"
            "E" -> "3"
            "I" -> "1"
            "O" -> "0"
            "U" -> "|_|"
            else -> it.value
        }
    }
private  fun placeOrder(patronName: String, menuData: String){
    val indexOfAppstrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfAppstrophe)
    println("$patronName 對 $tavernMaster 說了他們訂的酒水。 ")
    val (type,name,price) = menuData.split(',')
    val message = "$patronName 買了一杯 $name ($type) 花了 $price."
    println(message)
  //  performPurchase(price.toDouble())
    //  val phrase = "Ah, dlicious $name!"
    //  println("Madrigal 驚呼道: ${toDragonSpeak(phrase)}")
    val phrase = if (name == "Dragon's Breath"){
        "$patronName 驚呼道: ${toDragonSpeak("Ah, dlicious $name!")}"
    } else {
        "Madrigal 說道: 感謝 $name ."
    }
    println(phrase)
}