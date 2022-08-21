fun main () {
    val likes = 1411
    if (likes % 10 == 1 && likes % 100 !== 11)
    println ("Это понравилось " + likes + " человеку.")
    else
        println("Это понравилось " + likes + " людям.")
}