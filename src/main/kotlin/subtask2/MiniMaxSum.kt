package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {

        var listToSort = input.toMutableList()
        listToSort.sort()
        var result = listToSort.toIntArray()

        return intArrayOf(result.sum() - result.last(), result.sum() - result[0])

    }

}
