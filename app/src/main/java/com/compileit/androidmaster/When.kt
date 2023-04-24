package com.compileit.androidmaster

fun main(){

}

fun getResult(value: Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("holiwi")
    }
}

fun getSemestre(month:Int): String {
   return when(month){
        in 1..6 -> "primer"
        in 7..12 -> "segundo"
        !in 1..12 -> "no es nada"
       else -> {
           "valor incorrecto"
       }
   }
}

fun getTrimestre(month: Int){
    when(month){
        1,2,3 -> println("primer")
        4,5,6 -> println("secgundo")
        7,8,9 -> println("tercer")
        10,11,12 -> println("cuarto")
        else -> println("no es un mes")
    }
}

fun getMonth(month:Int) {
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        7 -> println("mayo")
        6 -> println("junio")
        8 -> println("julio")
        9 -> println("agosto")
        10 -> println("septiembre")
        11 -> {
            println("noviembre")
        }
        12 -> println("diciembre")
        else -> println("no es un mes")
    }
}