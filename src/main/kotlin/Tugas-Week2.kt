fun main() {
    val angka1: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val lambda2 =Array<Int>(10){it*2+6}//dimulai dari angka 6 kelipatan 2
    println(lambda2.toList())
    println(lambda2.size)
}