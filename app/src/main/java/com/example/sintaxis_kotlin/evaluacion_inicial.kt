package com.example.sintaxis_kotlin

import kotlin.math.PI

fun main() {
    parImpar(2)
    circunferencia(3.0)
    diaSemana()

    println("Ingresa tres números enteros:")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    ordena3numeros(a,b,c)
    aleatorio500()
    tablasMultiplicar(3)
    divisores(14)
    fibonacci()
    numeroPrimo(17)
    numeroPerfecto(28)
}

fun parImpar (n: Int) {
    if(n%2==0)
        println("$n es par")
    else
        println("$n es impar")
}

fun circunferencia (r: Double) {
    val l = 2*PI*r
    val a = PI*r*r
    println("La longitud de la circunferencia de radio $r es $l y su área $a")
}

fun diaSemana (){
    println("Escriba el día de la semana en el que estamos (del 1 al 7):")
    val n = readln().toInt()
    when (n) {
        1-> println("Hoy es lunes")
        2-> println("Hoy es martes")
        3-> println("Hoy es miércoles")
        4-> println("Hoy es jueves")
        5-> println("Hoy es viernes")
        6-> println("Hoy es sábado")
        7-> println("Hoy es domingo")
        else-> println("No ha introducido un número de día válido")
    }
    if (n in 1..5)
        println("Hoy es día laborable")
    if (n in 6..7)
        println("Hoy es festivo")
}

fun ordena3numeros (a: Int, b: Int, c: Int) {
    if(a<=b) {
        if (b<=c) {
            println("Los números ordenados son: $a <= $b <= $c")
        } else {
            if (a<=c) {
                println("Los números ordenados son: $a <= $c <= $b")
            } else {
                println("Los números ordenados son: $c <= $a <= $b")
            }
        }
    } else {
        if (c<=b) {
            println("Los números ordenados son: $c <= $b <= $a")
        } else {
            if (a<=c) {
                println("Los números ordenados son: $b <= $a <= $c")
            } else {
                println("Los números ordenados son: $b <= $c <= $a")
            }
        }
    }
}

fun aleatorio500 () {
    val n = (1..500).random()
    println("El número generado es $n")
    when (n) {
        in 1..100 -> println("Está en el intervalo [0, 100)")
        in 101..200 -> println("Está en el intervalo [100, 201)")
        in 201..300 -> println("Está en el intervalo [200, 301)")
        in 301..400 -> println("Está en el intervalo [300, 401)")
        in 401..500 -> println("Está en el intervalo [400, 500]")
    }
}

fun tablasMultiplicar (n: Int) {
    println("La tabla de multiplicar del $n mediante un bucle WHILE es:")
    var i = 1
    while(i<=10) {
        val p = n*i
        println("$n x $i = $p")
        i++
    }

    println("La tabla de multiplicar del $n mediante un bucle DO ... WHILE es:")
    i = 1
    do {
        val p = n*i
        println("$n x $i = $p")
        i++
    } while(i<=10)

    println("La tabla de multiplicar del $n mediante un bucle FOR es:")
    for(i in 1..10) {
        val p = n*i
        println("$n x $i = $p")
    }
}

fun divisores(n: Int) {
    println("Los divisores de $n son:")
    for (i in 1..n) {
        if(n%i==0)
            println(i)
    }
}

fun fibonacci () {
    var a = 0
    var b = 1
    println("Los primeros 20 términos de la serie de Fibonacci son:")
    println(a)
    println(b)
    for (i in 1..20) {
        val s = a+b
        println(s)
        a = b
        b = s
    }
}

fun numeroPrimo (n: Int) {
    var aux = 0
    for(i in 1..n) {
        if (n%i==0)
            aux++
    }
    if(aux==2)
        println("$n es primo")
    else
        println("$n no es primo")
}

fun numeroPerfecto (n: Int) {
    var s = 0
    for (i in 1..n-1) {
        if(n%i==0)
            s+=i
    }
    if(n==s)
        println("$n es un número perfecto")
    else
        println("$n no es un número perfecto")
}