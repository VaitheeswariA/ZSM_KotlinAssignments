import java.util.Scanner;
fun main() {
   var input=Scanner(System.`in`)
   if(input.hasNext())
   {
        var n1=input.nextInt()
        var a=Array<Int>(n1){0}
        for(i in 0..n1-1)
        {
            a[i]=input.nextInt()
        }
        var start=0
        var end=n1-1
        var cond=true
        for(i in 0..n1-1)
        {
            if(cond)
                print(a[end--])
            else
                print(a[start++])
            print(" ")
            cond=!cond
        }
    }
    
}

