fun main() {
println(Even(mutableListOf<String>("Chantal","Emma","Peter","Jeanne","Dad","Mum","Reverien","Cadette","Ritha","Angellot")))
println(Av(mutableListOf<Double>(50.0,46.0,30.0,40.0,78.0,88.0)))
  println(Av(mutableListOf<Double>(50.0,46.0,30.0,40.0,78.0,88.0))/6)
sorted()

humanBeing()
  var car1=Car("car128930",50.0)
  var car2=Car("car16743",79.0)
  var car3=Car("car37845",64.0)
  var car4=Car("car47838",80.0)
 var average=(car1.mileage+car2.mileage+car3.mileage+car4.mileage)/4
 println(average)

}
fun Even(Str:List<String>):List<String> {
    var LStr =mutableListOf<String>()
    for (name in Str) {
        if (Str.indexOf(name) % 2 == 0) {
            LStr.add(name)
        }
    }
            return LStr
        }

  fun Av(height:List<Double>):Double {
  return height.sum()
  return height.average()
}

data class Person(val name: String, val age: Int, val weight:Int, val height:Int)
fun sorted() {
  val persons = listOf(
    Person("Chantal", 20, 56, 51),
    Person("Emma", 13, 59, 91),
    Person("Peter", 65, 50, 50),
    Person("Jeanne", 80, 51, 59)


  )

  val age = persons.sortedByDescending { person -> person.age }
  println(age)
}


fun humanBeing() {
  var people = mutableListOf(
    Person("Chantal", 29, 56, 51) ,
    Person("Emma", 27, 59, 91),
  Person("Peter", 25, 50, 50),
 Person("Jeanne", 20, 51, 59)
  )

 people.addAll(listOf(
   Person("Angelot",5,20,15),
    Person("Rita",2,14,20)
  ))
  println(people)
}

data class Car(var registration:String,var mileage:Double)
data class CarsLists(
  var registration: List<Car>,
  var mileage: List<Double>
)
fun regist(CObjects:Car):Double{
  var cars= mutableListOf<Car>(CObjects)
  var registration= mutableListOf<Car>()
  var mileage= mutableListOf<Double>()
  var average=mileage.average()
  return average
}

