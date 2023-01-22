import java.util.Scanner
import java.util.*

/*
Mostrar el área y perímetro de un rombo.
*/
fun main () {
    var scData = Scanner(System.`in`)
    println("Ingresa la opción que deseas obtener")
    println("1.- Área del rombo | 2.- Perímetro del rombo")
    var userChoice = scData.nextInt()

    if (userChoice == 1) {
        println("Ingresa la diagonal A: ")
        var diagonalA = Scanner(System.`in`).nextFloat()
        println("Ingresa la diagonal B: ")
        var diagonalB = Scanner(System.`in`).nextFloat()
        var area = diagonalA * diagonalB / 2

        println("El Area del rombo es: $area")

    } else if (userChoice == 2) {
        println("Ingresa la medida de un lado del rombo:")
        var ladoUser = Scanner(System.`in`).nextFloat()
        var perimetroRombo = ladoUser * 4
        println("El perimetro del rombo es: $perimetroRombo")
    } else {
        println("Opcion incorrecta.")
    }

}