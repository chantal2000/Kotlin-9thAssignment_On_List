fun main() {
//println(Even(mutableListOf<String>("Chantal","Emma","Peter","Jeanne","Dad","Mum","Reverien","Cadette","Ritha","Angellot")))
//println(Av(mutableListOf<Double>(50.0,46.0,30.0,40.0,78.0,88.0)))
////  println(Av(mutableListOf<Double>(50.0,46.0,30.0,40.0,78.0,88.0))/6) var person1=Person("Chantal", 29, 56, 51)

  var person1 = Person("Chantal", 29, 56, 51)
  var person2 = Person("Emma", 27, 59, 91)
  var person3 = Person("Peter", 25, 50, 50)
  var person4 = Person("Jeanne", 20, 51, 59)


//
//  var person1 = Person("Chantal", 29, 56, 51)
//  var person2 = Person("Emma", 27, 59, 91)
//  var person3 = Person("Peter", 25, 50, 50)
//  var person4 = Person("Jeanne", 20, 51, 59)
//  var person5 = Person("Jeanne", 20, 51, 59)
//  var person6 = Person("Jeanne", 20, 51, 59)
//  Add()

//  var car1=Car("car128930",50.0)
//  var car2=Car("car16743",79.0)
//  var car3=Car("car37845",64.0)
//  var car4=Car("car47838",80.0)
//  var av=(car1.mileage+car2.mileage+car3.mileage+car4.mileage)/4
//  println(av)
//
}
//fun Even(Str:List<String>):List<String> {
//    var LStr =mutableListOf<String>()
//    for (name in Str) {
//        if (Str.indexOf(name) % 2 == 0) {
//            LStr.add(name)
//        }
//    }
//            return LStr
//        }

//  fun Av(height:List<Double>):Double {
//  return height.sum()
//  return height.average()
//}
  data class Person(var name: String, var age: Int, var height: Int, var weight: Int)
  fun Age(PObjects: Person) {
    var people = mutableListOf(PObjects)
    var sortedDescAge = people.sortedByDescending { person -> person.age }
    println(sortedDescAge)
  }




// data class Person(var name: String, var age: Int, var height: Int, var weight: Int)
//fun Add(PObjects:Person) {
//  var people= mutableListOf(PObjects)
//  people.addAll(listOf(people[4],people[5]))
//    println(people)
//}
//data class Car(var registration:String,var mileage:Double)
//data class CarsLists(
//  var registration: List<Car>,
//  var mileage: List<Double>
//)
//fun Reg(CObjects:Car):Double{
//  var cars= mutableListOf<Car>(CObjects)
//  var registration= mutableListOf<Car>()
//  var mileage= mutableListOf<Double>()
//  var av=mileage.average()
//  return av
//}

