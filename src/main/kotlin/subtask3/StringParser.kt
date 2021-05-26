package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val arr= mutableListOf<String>()
        for(i in inputString.indices){
            if(inputString[i]=='['||inputString[i]=='('||inputString[i]=='<'){
                arr.add(inputString.substring(i+1,i+findEnd(inputString.substring(i),inputString[i])))
            }
        }
        return arr.toTypedArray()
    }

    fun findEnd(inputString: String,elem:Char): Int {
        val endElem= when(elem){
            '['->']'
            '('->')'
            '<'->'>'
            else->')'
        }
        var count:Int=0
        var index:Int=0
        for(i in inputString.indices){
            if(inputString[i]==elem){
                count++
            }
            if(inputString[i]==endElem){
                count--
                if(count==0){
                    index=i
                    break
                }
            }
        }
        return index
    }
}
