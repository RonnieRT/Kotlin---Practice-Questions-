import java.util.Scanner
fun main(args:Array<String>){
    val testCases:Int=Integer.valueOf(readLine()!!)
    //println("nos: "+testCases)
    for(i in 1..testCases){
        val xyString:String?= readLine();
        if(!xyString.isNullOrBlank()){
            val xyList:List<String> = xyString.split(" ".toRegex())
            val x:Int=xyList.elementAt(0).toInt();
            val y:Int=xyList.elementAt(1).toInt();
            
            println(x-y)
            
        }
        else{
            println("data : "+xyString+"---")
        }
    }
}

