fun main() {
 var row=readLine()!!.toInt()
 var col=readLine()!!.toInt()
 var arr = Array(row){Array(col){0}}
 var col_to_sort=readLine()!!.toInt()
 for(i in 0..row-1)
 {
    for(j in 0..col-1)
    {
        arr[i][j]=readLine()!!.toInt()
    }
 }
 col_to_sort--
 for(i in 1..row-1)
 {
    var j=i-1
    var key=arr[i][col_to_sort]
    while(j>=0 && key< arr[j][col_to_sort])
    {
        arr[j+1][col_to_sort]=arr[j][col_to_sort]
        j--
    }
    arr[j+1][col_to_sort]=key
}

    for(i in 0..row-1)
    {
        for(j in 0..col-1)
        {
            print("${arr[i][j]} ")
        }
        println()
    }

}
