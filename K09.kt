fun main() 
{
    repeat(readLine()!!.toInt()){
        var (x, y) = readLine()!!.split(" ").map(String::toInt)
        if(5*x >= y)
            println("Yes")
        else
            println("No")
    }
}