package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var needChanges: Int = 0;
        for (i in 0 until  n / 2){
            if (digitString[i] != digitString[n - i - 1]){
                needChanges++
            }
        }
        val digitArr: CharArray = digitString.toCharArray()
        if (needChanges > k){
            return (-1).toString()
        }else{
            var i: Int = digitString.length - 1;

            while(k - needChanges > 0){
                digitArr[i] = '9'
                i--
                needChanges++
            }
        }
        return getStandartPalindrome(digitArr)
    }

    private fun getStandartPalindrome(digitArray: CharArray): String{
        var temp: Char
        for (i in 0 until digitArray.size / 2){
            if(digitArray[i] != digitArray[digitArray.size - i - 1]) {
                temp = if (digitArray[i] > digitArray[digitArray.size - i - 1]) {
                    digitArray[i]
                } else {
                    digitArray[digitArray.size - i - 1]
                }
                digitArray[i] = temp
                digitArray[digitArray.size - i -1] = temp
            }
        }
        return String(digitArray)
    }

}
