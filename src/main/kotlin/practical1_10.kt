class Car(info:String,Owner:String,miles:Int, OGPrice: Double,curPrice:Double){
    lateinit var info:String
    lateinit var Owner: String
    var miles: Int
    var OGPrice: Double
    var curPrice:Double

    init{
        println("Object of class is created and Init is called")
        this.info = info
        this.Owner = Owner
        this.miles = miles
        this.OGPrice = OGPrice
        this.curPrice = curPrice
    }
    fun getCarInfo():String{
        return info
    }
    fun getriginalCarPrice():Double{
        return OGPrice
    }
    fun getCurrentCarPrize(): Double{
        return curPrice
    }
    fun displayCarInfo(){
        println("-------------")
        println("Car Information: ${getCarInfo()}")
        println("Car Owner : $Owner")
        println("Miles Drive: $miles")
        println("Original Car Price : ${getriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrize()}")
        println("-------------\n")
    }
}

fun main(){
    println("Creating Car Class Object car1 in next line")
    var car1 = Car("BMW , 2018","Foram",105,10000.0,98950.0)
    car1.displayCarInfo()
    var car2 = Car("BMW, 2019","Ruby",20,400000.0 , 382990.0)
    car2.displayCarInfo()
    println("\n*********** ARRAYLIST OF CAR***********")
    val carlist = ArrayList<Car>()
    carlist.add(Car("Toyota ,2017","HPP",100,1080000.0, 10790900.0))
    carlist.add(Car("Maruti, 2020","Npp",200,4000000.0, 3700000.0))
    carlist[0].displayCarInfo()
    carlist[1].displayCarInfo()


}