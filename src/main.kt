fun main(){
    var dog = Dog()
    dog.sound()
    dog.eat()
    dog.color = "White"
    println(dog.color)
    dog.breed = "German shepherd"
    println(dog.breed)

    var cat = Cat()
    cat.sound()
    cat.eat()
    cat.age = 3
    println(cat.age)
}

open class Animal(){
    open fun sound(){
        println("Bark")
    }
    open fun eat(){
        println("The animal is eating")
    }


}
class Dog(): Animal(){
    var color: String = ""
    var breed: String = ""

    override fun eat(){
        println("The dog is eating")
    }

}
class Cat(): Animal(){
    var color: String = ""
    var age: Int =+1
    override fun sound(){
        println("Meow")
    }
    override fun eat() {
        //super.eat()
        println("The cat is eating")
    }
}