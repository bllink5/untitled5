class System {
    fun sistem(){
        println("Masukan jumlah Pemain : ")
        var input = readLine()
        var pemain = input!!.toInt()
        for (i in 1..pemain)
            User().sistemUser()

        println("               Main Lagi ?         ")
        println("                  Y/N              ")
        var inputPlay = readLine()
        if (inputPlay.equals("y",ignoreCase = true)) {
            return sistem()
        } else (inputPlay.equals("n",ignoreCase = true))
        println("               GAME OVER           ")
        println("       TERIMA KASIH TELAH BERMAIN  ")
    }
}