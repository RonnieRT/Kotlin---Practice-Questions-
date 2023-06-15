import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    
    val cases = scanner.nextInt()  
    
   for(i in 1..cases){
       
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val k = scanner.nextInt()
    
    if((m-k) >= n){
        println("yes")
    }else{
        println("no")
    }
   }
}
