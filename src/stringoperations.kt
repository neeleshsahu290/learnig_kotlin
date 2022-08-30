fun stringOperations (){


    // to get array of strings
    val alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    for (i in alphabet){
     //  println(i)
    }


    // split used in string
    val str= "a:b:c:d:e:f"
    val delim=":"
    val list= str.split(delim)
    for (i in list){
    //    println(i)
    }

    // initialize a char array
    val arr = charArrayOf('a','n','d','s','k')

    for (i in arr){
    //    println(i)
    }
   val new= arr.joinToString (limit = 2, truncated = "...!", separator = ":", prefix = "{", postfix = "}"){ it.uppercaseChar().toString() }
   // println(new)


    // get character at index
    val str1 = "abcd"
    val name = str1[0]
    println(name)



}