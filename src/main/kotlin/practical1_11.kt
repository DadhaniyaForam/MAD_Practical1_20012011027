import java.util.StringJoiner

fun main()
{
    val fMatrix = Matrix(arrayOf(intArrayOf(3,-2,5), intArrayOf(3,0,4)),2,3)
    val sMatrix = Matrix(arrayOf(intArrayOf(2,3), intArrayOf(-9,0), intArrayOf(0,4)),3,2)
    val sMatrix1 = Matrix(arrayOf(intArrayOf(6,3), intArrayOf(9,0), intArrayOf(5,4)),3,2)

    println("**********ADDITION***********")
    println("Matrix:1 ")
    print(sMatrix1.toString())
    print("Matrix:2")
    print(sMatrix.toString())
    val thirdMatrix = sMatrix1 + sMatrix
    println("Addition: \n$thirdMatrix")

    println("**********SUBTRACTION***********")
    println("Matrix:1 ")
    print(sMatrix1.toString())
    print("Matrix:2")
    print(sMatrix.toString())
    val subMatrix = sMatrix1 - sMatrix
    println("Subtraction: \n$subMatrix")

    println("**********MULTIPLICATION***********")
    println("Matrix:1 ")
    print(sMatrix1.toString())
    print("Matrix:2")
    print(sMatrix.toString())
    val mulMatrix = sMatrix1 * sMatrix
    println("Multiplication: \n$mulMatrix")


}
class Matrix(matrix:Array<IntArray>,i:Int,j:Int)
{
    var i: Int
    var j:Int
    lateinit var matrix: Array<IntArray>
    init{
        this.i = i
        this.j = j
        this.matrix = matrix
    }
    operator fun plus(p: Matrix): Matrix{
        val result = Array(i){IntArray(j)}
        for(row in 0 until i){
            for(column in 0 until j){
                result[row][column] = matrix[row][column] + p.matrix[row][column]
            }
        }
        return Matrix(result,i,j)
    }
    operator fun minus(p:Matrix):Matrix{
        val result  = Array(i){IntArray(j)}
        for(row in 0 until i){
            for(column in 0 until j){
                result[row][column] = matrix[row][column] - p.matrix[row][column]
            }
        }
        return Matrix(result,i,j)
    }
    operator fun times(p:Matrix):Matrix{
        val result = Array(i){IntArray(j)}
        for(row in 0 until i){
            for(column in 0 until j){
                for(k in 0 until j){

                result[row][column] += matrix[row][column] * p.matrix[row][column]
                    }}
}
        return Matrix(result,i,j)
    }
    override fun toString(): String{
        var msg: String = ""
        for(row in matrix.indices){
            for(column in 0 until matrix[row].size){
                msg += "${matrix[row][column]}"
            }
            msg += "\n"
        }
        return msg
    }
}