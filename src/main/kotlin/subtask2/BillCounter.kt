package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annaBill:Int=bill.filter { it!=bill[k] }.sum()/2
        return if(b-annaBill==0){ "bon appetit" }else{ (b-annaBill).toString()}
    }
}
