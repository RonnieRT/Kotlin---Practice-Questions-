class Solution {
    fun reverse(x: Int): Int {
        var num = x
        var res = 0
        while (num != 0) {
            res = res * 10 + num % 10
            if (res % 10 != num % 10) return 0
            num /= 10
        }
        return res
    }
}
