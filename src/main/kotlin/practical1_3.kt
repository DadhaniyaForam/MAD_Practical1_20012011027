import java.util.StringJoiner

fun main()
{
    print("\nStudent Enrollment No.:")
    var a : Long = readLine()!!.toLong()
    print("Student Name : ")
    var b : String = readLine()!!
    print("Student Branch :")
    var c : String = readLine()!!
    print("Student  Class :")
    var d : String = readLine()!!
    print("Student Batch :")
    var e : String = readLine()!!
    print("Student College Name :")
    var f : String = readLine()!!
    print("Student University Name :")
    var g : String = readLine()!!
    print("Student Age :")
    var h : Int = readLine()!!.toInt()

    print("\n\n **************************\n\n")
    println("Student's Data:")
    println("Enrollment No. $a")
    println("Name : $b")
    println("Age : $h")
    println("Branch : $c")
    println("Class : $d")
    println("Batch : $e")
    println("College Name : $f")
    println("University Name : $g")
}