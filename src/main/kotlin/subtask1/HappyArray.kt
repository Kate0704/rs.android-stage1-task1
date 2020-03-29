package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.size < 3) return sadArray

        var happyElements = sadArray.toMutableList()
        var i: Int
        var isHappy = false

        while (!isHappy) {
            isHappy = true
            i = 1
            while (i < happyElements.size - 1) {
                if (happyElements[i] > happyElements[i - 1] + happyElements[i + 1]) {
                    isHappy = false
                    happyElements.removeAt(i)
                }
                else i++
            }
        }

        return happyElements.toIntArray()

    }
}
