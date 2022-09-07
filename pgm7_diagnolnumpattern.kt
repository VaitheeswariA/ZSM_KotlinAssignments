import java.util.Scanner;
fun main() {
    var input=Scanner(System.`in`)
    if(input.hasNext())
    {
        var n:Int=input.nextInt()
        var x=0
        for(i in 0..n-1)
        {
            x++
            for(j in 0..n-1)
            {
                if(i==j || (i+j == n-1))
                    print("$x ")
                else
                    print("  ")
            }
            println()
        }
       
    }
}
