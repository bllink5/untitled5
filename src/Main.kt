fun main(){

    val system = System()
    var input = 0

    do {
        println("======================================")
        println("               DICE ROLL              ")
        println("======================================")
        println("               1. PLAY                ")
        println("               2. EXIT                ")
        input = readLine()!!.toInt()
        when(input){
            1-> system.sistem()
            2-> println("        TERIMA KASIH TELAH BERMAIN         ")
        }
    } while (input!=2)
}