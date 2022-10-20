package com.example.firstapp

fun main(args:Array<String>) {

    var age = 29;
    var candy = "Heyo Universe"
    println(candy)
    var weather = "rainy"
    println("Todays weather is :$weather")
    var wallet: Int = 10;
    println(wallet)
    wallet -= 5
    println(wallet)
    wallet -= 4
    println(wallet)
    println("You are No $wallet")
    var ageIs: Boolean = age > 25
    println(ageIs)
    var wwallet: String = "boom"

    var books: List<String> = listOf("lean startup", "zero to n")
    var cars: Array<String> = arrayOf("audi","Bmw","tesla")
    println(cars[2])
    println(books[1])
    var phones:MutableList<Int> = mutableListOf(1,2,3,4)
    println(phones[2])

    for(x in 1..100){
       if(x>45){ println(x)
    }}
    fun myDog(name:String, age:Int):String{
        return name+age
    }
    //myDog("mothi", 3)
    println(myDog("mothi", 3))
}