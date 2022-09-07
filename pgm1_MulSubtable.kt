import java.util.Scanner;
fun main() {
    var input=Scanner(System.`in`)
    if(input.hasNext())
    {
    var number:Int=input.nextInt()
    var ans:Int
    println("Multiplication table:")
    for(N in 1..10)
    {
    ans= number*N
    println("$number * $N = $ans")    
    }
    
    println("Subtraction table:")
    for(N in number..20)
    {
        ans=N-number
        println("$N - $number = $ans")
    }
    }
}
