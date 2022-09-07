import java.util.Scanner;
fun main() {
   var input=Scanner(System.`in`)
   if(input.hasNext())
   {
        var n1=input.nextInt()
        var n2=input.nextInt()
        var arr1=Array<Int>(n1){0}
        var arr2=Array<Int>(n2){0}
        var arr_list=ArrayList<Int>()
        for(i in 0..n1-1)
        {
            arr1[i]=input.nextInt()
            arr_list.add(arr1[i])
        }
        for(i in 0..n2-1)
        {
            arr2[i]=input.nextInt()
            if(!(arr2[i] in arr1))
           arr_list.add(arr2[i])
        }
   
        var arr3: Array<Int> =arr_list.toTypedArray()
        sorting(arr3)
        for(i in arr3)
        {
            println(i)
        }
}
}

fun sorting(a:Array<Int>)
{
    var n1=a.size
    for(i in 1..n1-1)
    {
    var j=i-1
    var key=a[i]
    while(j>=0 && key<a[j])
    {
        a[j+1]=a[j]
        j--
    }
    a[j+1]=key
   }
}
