import java.util.*

fun main(){
    
    val scanner = Scanner(System.`in`)
    
    val count = scanner.nextInt()
    
    for(i in 1..count){
        val x = scanner.nextInt()
        val y = scanner.nextInt()
        
        if(y <= x){
            println("YES")
        }else{
            println("NO")
        }
    }
}