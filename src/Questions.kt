
import java.util.*


fun questions () {
    //swapTwoNumbers()
    // print( stringContainsVowels("neelesh"))
    //  println( reverseString("i have two items"))
    //  println("The number is prime "+isPrimeNumber(22))
    // println("list having only odd number ${listHavingOnlyOddNum(listOf(1,3,5))}")

   //  print( "this string is palidrome "+isStringPalindrome("naman"))
   // println()
   // println(removeBlankSpacesInString("  this string is palidrome "))


   // println( sortedArray(arrayOf(1,5,4,8)))
  //  var list = listOf<String>("fkdf","hfdjd","efjhdeif","djhwk")
    //reverseArrayList(list).map { println(it) }

    //checkArrayContainsSameElement()

    getDistinctCharinString("neeledh",'e')
}

    // Ques 1 how to revers a string
    fun reverseString(reversedString: String): String {
        return reversedString.split(" ").reversed().joinToString(" ")


    }


    //Ques 2  print the list by setting buzz at multiple of 3 and man at multiple of 5
    fun printOnetoHun() {

        for (i in 1..100) {
            if (i % 3 == 0) {
                print("buzz")
            } else if (i % 5 == 0) {
                print("man")
            } else {
                print(i)
            }
            print(",")
        }
        println()
        println((1..100).map { index ->
            mapOf(0 to index,
                    index % 3 to "fizz",
                    index % 5 to "dazz"
            )
        })
    }

    // Ques 3 swap two number without implementing third variable
    fun swapTwoNumbers() {
        var a: Int = 5
        var b: Int = 2

        b = a + b
        a = b - a
        b = b - a
        println("a is $a" + "   " + "b is $b")

    }

    // @ues 4 String contains vowels or not
    fun stringContainsVowels(name: String): Boolean {
        // lower case make all the parameter in string a lowercase
        name.lowercase().toString()

        // for single character find inside a string
        name.lowercase().contains('a')

        var count = 0


        var idHavingVowel = false

        for (i in name.lowercase().toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                idHavingVowel = true
                count++
            }

        }
        println("number of vowels present are $count")

        return idHavingVowel

    }


    // Ques 5 check a number is prime or not
    fun isPrimeNumber(number: Int): Boolean {

        if (number % 2 == 0) {
            return true
        }

        return false

    }

    // Ques 6 check list of int contains only odd number
    fun listHavingOnlyOddNum(list: List<Int>): Boolean {
        var ishavingevenhum = false
        for (num in list) {
            if (num % 2 == 0) {
                ishavingevenhum = true
                return false

            }
        }

        return true
    }


//Ques 7 check a String weather a Palindrome or not
//Palindrome means after reversing a string the string is same
fun isStringPalindrome(string:String):Boolean{
    var reversedSring=string.reversed()

    if (reversedSring==string){
        return true
    }
    return false
}

//Ques 8 remove blank spaces in string
fun removeBlankSpacesInString(str:String):String{

    return str.toCharArray().filter {  it !=' ' }.joinToString("")

}

//Ques 9 remove leading and trailing space from string
fun removeLeadingandtrailingSpaceinString(str:String):String{
    return str.trim()
}

//Ques 10 sort array in Kotlin
fun sortedArray(arr:Array<Any>): Unit { println( arr.sort())}

//Ques 11 find factorial of a number
fun factorial(n: Long): Long {
    return if (n == 1L) 1 else n * factorial(n - 1)
}

//Ques 11 reverse a list in kotlin
fun reverseArrayList(list:List<String>): List<String> {
    return  list.reversed()
}

//Ques 12  check two arrays contains same element
fun checkArrayContainsSameElement(){
    val arr1 = intArrayOf(1,2,7)
    val arr2 = intArrayOf(4,8,7)

    var  cont =0

    for (element in arr1){

        arr2.map {
            if (it==element){
                cont++
                println("contain element is $it")
            }
        }
    }

    println("total element count is $cont")
}

//Ques 13 sum of integers
fun sumOfIntArray(arr:IntArray):Int{
    var sum= 0
    for (i in arr){
        sum += i
    }
    return sum
}

//Ques 14 find Second Highest NUmber
private fun findSecondHighest(array: IntArray): Int {
    var highest = Int.MIN_VALUE
    var secondHighest = Int.MIN_VALUE
    for (i in array) {
        if (i > highest) {
            secondHighest = highest
            highest = i
        } else if (i > secondHighest) {
            secondHighest = i
        }
    }
    return secondHighest
}

//Ques 15 merge two list in kotlin
fun mergedlist(){
    val list1:ArrayList<Int> =ArrayList()
    val list2:ArrayList<Int> = ArrayList()
    for (i in 1..20){
        list1.add(i)
        list2.add(i)
    }
    val merglist:ArrayList<Int> = ArrayList()
    merglist.addAll(list1)
    merglist.addAll(list2)
}

// Ques 16 Shuffle  a array
fun shuffleArray(){
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    val rand = Random()

    for (i in array.indices) {
        val randomIndexToSwap: Int = rand.nextInt(array.size)
        val temp = array[randomIndexToSwap]
        array[randomIndexToSwap] = array[i]
        array[i] = temp
    }
    println(array.contentToString())
}

//Ques 17 remove all occurrences of a given character from input String
fun removeOccurrencesOfString(str:String):String{

    return str.replace("a","")
}

//Ques 18 get a distinct characters and their count in a String
fun getDistinctCharinString(str:String,char:Char){

    var count=0

    for (i in str.toCharArray()){
        if (i==char){
            count++
        }
    }
    println("The count of char in the string is $count")
}