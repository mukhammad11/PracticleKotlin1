import kotlin.math.*

fun main()
{
    //Задание 1
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved++
    //Конец 1 задания


    //Задание 2
    val MyAge: Int = 18
    exercisesSolved++
    //Конец 2 задания


    //Задание 3
    var MyAgeDouble: Double = 18.0
    MyAgeDouble = (MyAgeDouble + 30.0)/2
    exercisesSolved++
    //Конец 3 задания


    //Задание 4
    val testNumber = 111
    val eventOdd = testNumber % 2
    exercisesSolved++
    //C eventOdd ничего не произошло
    //Конец 4 задания


    //Задание 5
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    exercisesSolved++
    //Конец 5 задания


    //Задание 6
    var age: Int
    age = 16
    print(age)
    age = 30
    print(age)
    exercisesSolved++
    //Конец 6 задания


    //Задание 7
    val answer1:Int = (46 * 100) + 10
    val answer2:Int = (46 * 100) + (10 * 100)
    val answer3:Int = (46 * 100) + (10 / 10)
    exercisesSolved++
    //Конец 7 задания


    //Задание 8
    //
    var c = (5 * 3) - ((4 / 2) * 2)
    exercisesSolved++
    //Конец 8 задания


    //Задание 9
    val a:Double = 10.0
    val b:Double = 15.0
    val average = (a + b) / 2
    exercisesSolved++
    //Конец 9 задания


    //Задание 10
    val fahrenheit:Double = 50.0
    val celcius = (fahrenheit - 32) / 1.8
    exercisesSolved++
    //Конец 10 задания


    //Задание 11
    val position = 57
    val row = position / 8
    val column = position % 8
    exercisesSolved++
    //Конец 11 задания


    //Задание 12
    val degrees: Double = 160.0
    val radians = degrees * PI / 180
    exercisesSolved++
    //Конец 12 задания


    //Задание 13
    val x1: Double = 6.0
    val y1: Double = 4.8
    val x2: Double = -3.9
    val y2: Double = -7.2
    val distance  = sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
    //Конец 13 задания
}