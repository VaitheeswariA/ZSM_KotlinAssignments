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
        
        for(i in 2..n1-1 step 2)
        {
            var j=i-2
            var key=a[i]
            while(j>=0 && key<a[j])
            {
                a[j+2]=a[j]
                j-=2
            }
            a[j+2]=key
        }
        
        for(i in 3..n1-1 step 2)
        {
            var j=i-2
            var key=a[i]
            while(j>=0 && key>a[j])
            {
                a[j+2]=a[j]
                j-=2
            }
            a[j+2]=key
        }
        
        for(i in n1-1 downTo 0)
        {
            println(a[i])
        }
    }
    
}

