package com.example.sintaxis_kotlin

fun variablesNumericas() {

    //Int -2,147,483,647 a 2,147,483,647 (4 bytes = 32 bits)
    var age2: Int = 50
    age2 = 44

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807 (8 bytes = 64 bits)
    val example: Long = 30
    val example2: Long = 30

    //Float (4 bytes)
    val floatExample: Float = 30.5f

    //Double (8 bytes)
    val doubleExample: Double = 3241.3123123
}

fun variablesAlfaNumericas() {

    //Char (2 bytes)
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String (tamaño variable, se puede consultar con el método .getBytes().length)
    val stringExample: String = "Rubén"
    val stringExample2 = "Manero"
    val age = 44

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample y tengo $age años"
    val example123: String = age.toString()
}

fun variablesBoolean() {

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = false
}


fun showMyName() {
    println("Me llamo Rubén")
}
fun showMyAge(currentAge: Int = 44) {
    println("Tengo $currentAge años")
}
fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}
fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}
fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

fun ifInt(){
    var age = 18

    if(age >= 18){
        println("Beber cerveza")
    }else if (age < 16){
        println("Beber zumo")
    }else{
        println("Beber a escondidas")
    }
}

fun getSemester(month: Int) = when(month){
    in 1..6 ->  "Primer semestre"
    in 7..12 ->   "Segundo semestre"
    !in 1..12 -> "Semestre no válido"
    else ->  "Error"
}

fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> print("Trimestre no valido")
    }
}

fun main(){
    var num: Int
    print("Ingrese un numero: ")
    num = readLine()?.toInt() as Int

    println(num)

    showMyName()
    showMyAge()
    add(25, 76)

    val mySubtract = subtract(10, 5)
    println(mySubtract)

    val mySubstractCool = subtractCool(8, 5)
    println(mySubstractCool)

    ifInt()
    val semester = getSemester(3)
    println(semester)
    getTrimester(5)

    var dia = 1
    println("\nEmpieza la semana")
    while(dia < 6) {
        if  (dia == 1) {
            println("$dia dia trabajando")
        } else {
            println("$dia dias trabajando")
        }

        dia++ // Actualizamos la condicion
    }
    println("A descansar")

    var numero:Int
    do {
        println("Introduce un numero entre 1 y 100")
        numero = readLine()!!.toInt()
    } while(numero !in 1..100) // numero < 1 || numero > 100
    println("El numero introducido es $numero")

    for(num in 1..5){
        println(num)
    }

    for (num in 1..10) {
        if (num % 2 == 0) {
            continue
        }
        print("$num ")
    }

    print("\n")
    for (num in 1..10) {
        if (num % 5 == 0) {
            break
        }
        print("$num ")
    }

    //Indice 0-6
    //Tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println()
    println(weekDays)
    println(weekDays[0])
    println(weekDays.size)

    //Modificar valores
    weekDays[0] = "Feliz lunes"
    println(weekDays[0])

    //Bucles para Arrays
    for(position in weekDays.indices){
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("La posición $position, contiene $value")
    }

    for (variable in weekDays){
        println("Ahora es $variable")
    }

    weekDays.forEach {
        println(it)
    }
    println()

    inmutableList()

    println()
    mutableList()
}

fun inmutableList(){
    val weekDays:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekDays.size)
    println(weekDays)
    println(weekDays[0])
    println(weekDays.last())
    println(weekDays.first())
    //Filtrar
    val example = weekDays.filter { it.contains("a")  }
    println(example)
    //Iterar
    weekDays.forEach { weekDay -> println(weekDay) }
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(3,"additionalDay")
    println(weekDays)

    if(weekDays.isEmpty()){
        //No voy a printear nada porque no hay
    }else{
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }
}




