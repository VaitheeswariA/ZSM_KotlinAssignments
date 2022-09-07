import java.util.Scanner;
fun main() {
    var input=Scanner(System.`in`)
    if(input.hasNext())
    {
        var ch:Char=input.next().single()
        for(alph in ch..'Z')
        {
        print(alph)
        }
    }
}
