import java.lang.StrictMath.random

fun main(){

    println("====== DICE ======")
    println("Isi nama anda")
    val name = readLine()?.toLowerCase()

    //var min = 1
    //var max = 6
    val dc = 1..6
    var score = 0
    val roll = "yes"

    println("Roll the dice?")
    while (roll == "yes" || roll =="y"){
        println("rolling....")
        val dice1 = dc.random()
        //val dice2 = dc.random()

        val total = dice1
        //var score1 = score + total
        if (total == 1 || total == 3 || total == 5)
            score = score+5
        else
            
    }

}