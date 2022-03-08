fun main () {
    strngs(arrayOf("laura","alinda","kengaaju"))
    namesofcities(arrayOf("harare","mumbai","dodoma","jakarta"))
    nums(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    names(arrayOf("john","alinda","tibenda"))


}

fun strngs(name: Array<String>) {
    println(name.contentToString())
}

fun namesofcities(city:Array<String>){
    city.forEach{ x ->
        println(x.capitalize())
    }
}

fun nums(num:Array<Int>){
    var sum = num[1] + num[4]
    println(sum)

    var m=num.indexOf(158)
    println(m)

    var ascending = num.sortedArray()
    println(ascending.contentToString())
}
fun names(name:Array<String>):Array<String> {
    var name= name
    println(name.contentToString())
    return(name)
}









