fun main() {
    isEven(4)
    isEven(10)
    isEven(5)
    isEven(8)
    var c=house("nairobi")
    println(c[0])
    println(c[2])
    println(c[4])






}
fun isEven(num:Int){
    if(num%4==0){
        println("true")
    }
    else{
        println("false")
    }

}
data class attributes ( var name:String, var weight:Int,var  price:String, var category:String){
    fun allLists(category:String){
        when(category){
            "groceries"->println("i need wheat")
            "hygiene"->println("i like my estate")
            else->println("i am jogging")

        }




    }




fun evenIndex(name:String):String{
    var house=name
    return house


}
}










