package subtask3

import kotlin.math.abs

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val resultBill = (bill.sum() - bill[k]) / 2
        return if (resultBill == b)
            "bon appetit"
        else
            (abs(resultBill - b)).toString()
    }
}
