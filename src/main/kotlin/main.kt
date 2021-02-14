fun main(args: Array<String>) {
    printMyName()
    printMyAge(56,"IAN")
    //create add variables
    val add = addition(77,90)
    println("ADDED NUMBERS: $add")
    //value from anyFunction
    val myAny = anyFunction()
    println("ANY VALUE: $myAny")
    //value from sub
    val subtract = sub(65,9)
    println("SUB VALUE: $subtract")
    // using sayHello
    val myHello = sayHello("OKUMU")
    //use repeatFunction
    repeatFunction()


}
//function that prints name
fun printMyName(){
    println("My name is Ian")
}
//function with parameters
fun printMyAge(age:Int, name:String){
    println("My name is: $name and my age is : $age")
}
//function with two parameters and return value
fun addition(num1:Int, num2:Int) :Int {
    //adding the two values
    val num3 = num1 + num2
    //return the value
    return num3
}
//unit function
fun unitFunction():Unit{

}
//any function
fun anyFunction() : Any{
    return 24.0
}
//inline function
fun sub(num1: Int,num2: Int) : Int = num1 - num2

//unit inline function
fun sayHello(name: String) : Unit =
    println("Hello : $name")

//internal functions
fun eat() : String{
    //internal 1
    fun food():String{
        return "CHICKEN"
    }
    // internal 2
    fun drink(): String{
        return "MILK"
    }

return "FAV-FOOD: ${food()} , FAV-DRINK: ${drink()}"

}

//repeatFunction
fun repeatFunction(){

    repeat(5){
        print("Hello,")
    }

}

