import java.lang.StrictMath.random
import java.lang.Thread.sleep

fun main(){

    println("====== DICE ======")
    println("Isi nama anda")
    val name = readLine()?.toLowerCase()

    //var min = 1
    //var max = 6
    val dc = arrayOf(1,2,3,4,5,6)
    var score = 0
    val roll = "yes"


    var total = 0
    if (total == 1 or 3 or 5){
        score = 5
    } else {
        //total == 2 or 4 or 6
        score = 3
    }
    println("Roll the dice?")
    println(readLine())
    if(roll == "yes" || roll =="y"){
        println("rolling....")
        val dice = dc.random()
        //sleep(1)
        println(dice)
        val dice2 = dc.random()
        println(dice2)

        val dice3 = dc.random()
        println(dice3)

        val dice4 = dc.random()
        println(dice4)

        val dice5 = dc.random()
        println(dice5)

//        val tt1 = dice+score
//        val tt2 = dice2+score
//        val tt3 = dice3+score
//        val tt4 = dice4+score
//        val tt5 = dice5+score
//        total = tt1+tt2+tt3+tt4+tt5
        total = (dice+score) + (dice2+score) +(dice3+score) +(dice4+score) +(dice5+score)


         score = score + total
        //println(dice)
        println("score kamu adalah $score")
    }else{
        println("error")
        return main()
    }
}