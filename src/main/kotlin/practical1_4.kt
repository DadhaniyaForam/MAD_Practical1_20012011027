fun main()
{
    print("Enter a Number :")
    var a : Int = readLine()!!.toInt()
    print(if(a % 2 ==0)
        "Even Number"
    else
        "Odd Number")
}