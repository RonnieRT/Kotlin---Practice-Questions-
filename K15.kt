<<<<<<< HEAD
class Solution {

fun isPalindromeEasy(x: Int): Boolean {
    val xString = x.toString()
    return xString == xString.reversed()
}

fun isPalindrome(x: Int): Boolean {
    when {
        x < 0 -> return false
        x < 10 -> return true
    }

    val digitList = breakNumberIntoDigitsList(x)
    return isDigitListPalindrome(digitList)
}

private fun breakNumberIntoDigitsList(num: Int): List<Int> {
    val digitList = mutableListOf<Int>()
    var remaining = num

    while (remaining > 0) {
        val lastDigit = remaining % 10
        remaining /= 10

        digitList.add(lastDigit)
    }

    return digitList
}

private fun isDigitListPalindrome(digitList: List<Int>): Boolean {
    var start = 0
    var end = digitList.lastIndex

    while (start < end) {
        val startDigit = digitList[start]
        val endDigit = digitList[end]

        if (startDigit == endDigit) {
            start++
            end--
        } else {
            return false
        }
    }

    return true
}
}
=======
class Solution {

fun isPalindromeEasy(x: Int): Boolean {
    val xString = x.toString()
    return xString == xString.reversed()
}

fun isPalindrome(x: Int): Boolean {
    when {
        x < 0 -> return false
        x < 10 -> return true
    }

    val digitList = breakNumberIntoDigitsList(x)
    return isDigitListPalindrome(digitList)
}

private fun breakNumberIntoDigitsList(num: Int): List<Int> {
    val digitList = mutableListOf<Int>()
    var remaining = num

    while (remaining > 0) {
        val lastDigit = remaining % 10
        remaining /= 10

        digitList.add(lastDigit)
    }

    return digitList
}

private fun isDigitListPalindrome(digitList: List<Int>): Boolean {
    var start = 0
    var end = digitList.lastIndex

    while (start < end) {
        val startDigit = digitList[start]
        val endDigit = digitList[end]

        if (startDigit == endDigit) {
            start++
            end--
        } else {
            return false
        }
    }

    return true
}
}
>>>>>>> f63cd05387b8a948f48a2284506c1d4de5bcd6c4
