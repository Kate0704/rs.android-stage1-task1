package subtask4

import com.sun.org.apache.xpath.internal.operations.Bool

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var res = emptyArray<String>().toMutableList()

        var bracketsMap = emptyMap<Char, Char>().toMutableMap()

        val squareBracket = 0
        val parenthesis = 1
        val angleBracket = 2

        val bracketsList = listOf<Char>('[', '(', '<')

        bracketsMap[bracketsList[squareBracket]] = ']'
        bracketsMap[bracketsList[parenthesis]] = ')'
        bracketsMap[bracketsList[angleBracket]] = '>'

        var k: Int
        var closedFind: Boolean
        for (i in inputString.indices) {
            if (inputString[i] in bracketsList) {
                closedFind = false
                val opened = inputString[i]
                k = i + 1
                var tempString = ""
                while (k < inputString.length) {
                    if (inputString[k] == opened) {
                        if (closedFind)
                            break
                        else
                            tempString += inputString[k].toString()
                    } else if (inputString[k] == bracketsMap[opened]) {
                        res.add(tempString)
                        tempString += inputString[k].toString()
                        closedFind = true
                    } else {
                        tempString += inputString[k].toString()
                    }
                    k++
                }
            }
        }
        return res.toTypedArray()
    }
}