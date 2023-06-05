import java.util.*

fun main(){
    
    val scanner = Scanner(System.`in`)
    
    var t = scanner.nextInt()
    
    while(t-- > 0){
        val x = scanner.nextInt()
        
        if(x >= 67 && x <= 45000){
            println("yes")
        }else{
            println("no")
        }
    }
    
}
