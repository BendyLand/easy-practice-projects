package palindrome 

object PalindromeChecker:
    def check(text: String) =
        val originalText = text.toLowerCase().split(' ').mkString
        val reverseText = text.toLowerCase().split(' ').mkString.reverse
        if originalText == reverseText then 
            true
        else
            false

