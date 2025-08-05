
fun main(){

    var playerchoice = ""
    var computerchoice =""
    println(" Enter the choice : Rocks,Paper,Scissors")
    playerchoice = readln()

    if(playerchoice!in listOf("rocks","paper", "scissors")){
        println(" Please Enter the valid choice ")
        return
    }

    val randomnumber = (1..3).random()
    when(randomnumber){
        1-> {
            computerchoice= "rocks"
        }
        2-> {
            computerchoice="paper"
        }
        3-> {
            computerchoice= "scissors"
        }
    }
    println(computerchoice)

    val winner = when{
        playerchoice == computerchoice -> "Tie"
        playerchoice == "rocks" && computerchoice == "scissors" -> "Players"
        playerchoice == "scissors" && computerchoice == "paper" -> "Players"
        playerchoice == "paper" && computerchoice == "rocks" -> "Players"
        else ->"Computer"
    }
    if(winner == "Tie"){
        print("Its a Tie")
    }else{
        println("$winner Won!")
    }
}
