fun collectionOperator() {


    val str= listOf<String>("neel","neel2","neel3","neel4","neel5","neel6","neel7","neel8","neel8","neel9","neel10")

    // to get last value
    println(str.last())

    // find value contains or not return boolean
   val cal= str.contains("neel7")
    println(cal)

    // reversed a list
    val n = str.asReversed()
   // println(n)


    n.forEach {
        println(it)
    }
    str.map {
       // println(it)
    }

    val str2= arrayOf<Int>(1,5,8,45,6,7,52,2,0,4)

    // this arrange array in increase order
    str2.sort()

    // this shorty by given value
    str2.sortBy { a-> a==2 }

    // this used to remove element and recreate list
    val str3: ArrayList<Int> =str2.filter { a-> a!=2  } as ArrayList<Int>


    str2.sortedWith(Comparator<Int>{ a, b ->
        when {
            a > b -> 1
            a < b -> -1
            else -> 0
        }
    })

    for (i in str2){
     //    println(i)
    }

  //  println(str2)


}