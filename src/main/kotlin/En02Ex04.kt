import java.util.*

/*
Hacer un programa que ingrese por teclado un número total de segundos y que luego
pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor
ingresado.
 */



fun main() {
    var segundosUsuario:Int
    var segundos:Int
    var minutos:Int
    var horas:Int
    var dias:Int
    var scData = Scanner(System.`in`)
    println("Introduce el numero de segundos que deseas convertir: ")
    segundosUsuario = scData.nextInt()

    minutos = segundosUsuario / 60
    segundos = segundosUsuario % 60
    horas = minutos / 60
    minutos = minutos % 60
    dias = horas / 24
    horas = horas % 24

    println("${segundosUsuario} segundos son iguales a: ${dias} dias ${horas} horas ${minutos} minutos ${segundos} segundos")

}
