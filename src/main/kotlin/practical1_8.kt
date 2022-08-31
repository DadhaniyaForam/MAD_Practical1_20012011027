fun main() {
    print("Please enter size of array:")
    val input1 = readLine()!!
    val array_size: Int = input1.toInt()
    val myarray = Array<Int>(array_size) { 0 }
    val myarray2 = myarray
    println("Please enter elements")
    for (i in 0..array_size - 1) {

        print("arr[$i]=")
        myarray.set(i, readLine()!!.toInt())
    }

    var temp: Int
    for (i in 0..array_size - 1) {
        for (j in 0..array_size - 1) {
            if (myarray[i] <= myarray[j]) {
                temp = myarray[i]
                myarray[i] = myarray[j]
                myarray[j] = temp
            }
        }
    }

    println("#Method 1 - Without using inbuilt function")
    println("----Sorted Array ")

    for (i in 0..array_size - 1) { println("arr[$i]=" + myarray[i])
    }

    println("#Method 2 - Using inbuilt function")
    println("----Sorted Array ")
    myarray2.sort()
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + myarray2[i])
    }
}