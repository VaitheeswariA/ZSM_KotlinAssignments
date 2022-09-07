import java.util.Scanner;
fun main() {
    var input=Scanner(System.`in`)
    if(input.hasNext())
    {
        var number:Int=input.nextInt()
        var rev=0
        var n=number
        var rem:Int
        while(n>0)
        {
            rem=n%10
            rev=(rev*10)+rem
            n=n/10
        }
        println(number-rev)
        
    }
}
