import java.util.*

fun main(){
    val input = Scanner(System.`in`) //creating new instance
    var t = input.nextInt()
    var ans = ""
    
    while(t-->0){
        ans = if(input.nextInt() + input.nextInt() < 7){
            "NO"
        } else {
            "YES"
        }
        println(ans)
    }
}
