import java.util.*


fun main(){
    val scanner = Scanner(System.`in`)
    
    var t = scanner.nextInt()
    
    val currentWinnerArray = Array<Int>(t, init = {0})
    val currentLeadArray = Array<Int>(t, init = {0})
    
    var maxLead = 0
    var maxLeader = 0
    
    var s1 = 0
    var s2 = 0
    
   for(i in 0 until t){
         s1 = s1 + scanner.nextInt()
         s2 = s2 + scanner.nextInt()
        
        if(s1 >= s2){   
           currentWinnerArray[i] = 1 
           currentLeadArray[i] = s1 - s2
        }else{
            currentWinnerArray[i] = 2
            currentLeadArray[i] = s2 - s1
        }
        
        if(currentLeadArray[i] > maxLead){
            maxLead = currentLeadArray[i]
            maxLeader = currentWinnerArray[i]
        }
       
    }
    
    
    println("$maxLeader $maxLead")
}
