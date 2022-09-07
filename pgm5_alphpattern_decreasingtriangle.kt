import java.util.Scanner;
fun main() {
    var input=Scanner(System.`in`)
    if(input.hasNext())
    {
        var ch:Char=input.next().single()
        
        for(i in ch downTo 'A')
        {
            for(j in i downTo 'A')
            {
                print(i)
            }
            println()
        }
       
    }
}
