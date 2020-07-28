class User() {
    fun sistemUser(){
        var hasil = 0
        println("silahkan masukan nama anda : ")
        var name = readLine()?.toLowerCase()
        var rounds = 1
        do {
            println("Round " + rounds)
            println(name + " Roll : " + Dice.diceRoll.random() )
            when (Dice.diceRoll.random()) {
                1 -> {
                    hasil +=5
                }
                2 -> {
                    hasil -=3
                }
                3 -> {
                    hasil +=5
                }
                4 -> {
                    hasil -=3
                }
                5 -> {
                    hasil +=5
                }
                6 -> {
                    hasil -=3
                }
            }
            //dice.dice_Roll()
            rounds ++
        }while (rounds !=6)

        //dice.dice_Roll()
        println("Point yang kamu dapat = $hasil")
        println()
    }
}