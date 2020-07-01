class User1 {
    fun sistemUser1(){
        println("silahkan masukan nama anda : ")
        var name = readLine()?.toLowerCase()
        if (name != null) {
            if (name <4.toString())
                println("minimal 4 karakter")
            println("silahkan masukan nama anda")
            name = readLine()?.toLowerCase()
        }
    }
}