package subtask1

class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray= if(sadArray.isNotEmpty()){
            mutableListOf(sadArray.first())
        }else{
            return intArrayOf()
        }
        for(i:Int in 1 until sadArray.size-1){
            if(sadArray[i]<=sadArray[i-1]+sadArray[i+1]){
                happyArray.add(sadArray[i])
            }
        }
        happyArray.add(sadArray.last())
        if(!checkIfHappy(happyArray.toIntArray())){
            happyArray= convertToHappy(happyArray.toIntArray()).toMutableList()
        }
        return happyArray.toIntArray()
    }

    private fun checkIfHappy(maybeHappyArray: IntArray):Boolean{
        for(i in 1 until maybeHappyArray.size-1){
            if(maybeHappyArray[i]>maybeHappyArray[i-1]+maybeHappyArray[i+1]){
                return false
            }
        }
        return true
    }
}
