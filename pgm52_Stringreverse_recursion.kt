fun main() {
    var input_str=readLine()!!
    var output=reverseStr(input_str)
    println(output)
}

fun reverseStr(s:String):String
{
    if(s.length==0)
        return s
        
    var words=s.split(" ",limit=2)
    var first_part=words[0]
    var last_part:String
    if(words.size==2)
        last_part=words[1]
    else
        last_part=""
    
    
    return reverseStr(last_part)+first_part+" "
    }
