fun main(){
    var count = 5;
    println("Enter the number");
    var x= readln().toInt()
    while (count>=1){
        println("Hello Code")
        count--;
    }

    var index = 1;
    while (index<=10){
        println(x*index)
        index++
    }
    println("OutSide Loop -"+index)


    index = 5;
    do{
        println("Hello")
        index++
    }while(index>5)

}