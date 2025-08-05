fun main(){
    val number = 10;
    val result = number in 1..20 // reange
    println(result)

    val animal ="Horse"
     val result1 = when(animal){
        "Horse" -> println("Anumail is Horse ")
        "Cat" -> println("Animal is Cat")
        "Dog"  -> println("Animal is Dog")
        else -> println("Animal Not Found")
    }

    println(result1)

    val ans = 11;

    val rs = ans in 1..20
    println(rs)

    println("Enter the number:")
    val k= readln().toInt()
    val res = when(k) {
        11 -> "Eleven"
        else -> "Not in the range"
    }

    println(res)

}