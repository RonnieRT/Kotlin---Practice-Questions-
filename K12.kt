import java.util.*

fun main(){
    
    val scanner = Scanner(System.`in`)
    
    val count = scanner.nextInt()
    
    for(i in 1..count){
        
        val x = scanner.nextInt()
        val y = scanner.nextInt()
        var result = 0
        if(x > y){
             result = x - y
            println(result)
        }else{
            result = y - x
            println(result)
        }
        
        
    }
    
}
