import java.util.Scanner;
fun main() {
   var input=Scanner(System.`in`)
   if(input.hasNext())
   {
        var n1=input.nextInt()
        for(i in 0..n1-1)
        {
            var start=1
            var second=i
            for(j in i..n1-2)
            {
                print("  ")
            }
            for(k in 0..i)
            {
              
                print("$start ")
                  start++
               
            }
            
            for(l in 0..i-1)
            {
                
                print("$second ")
                second--
            }
            println()
        }
    }
    
}

