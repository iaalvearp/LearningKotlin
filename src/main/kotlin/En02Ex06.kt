import java.util.Scanner

/*
Mostrar el área y perímetro de un hexágono.
 */

fun main () {
    println("Ingresa el lado del hexágono")
    var lado = Scanner(System.`in`).nextDouble()
    var perimetro = lado * 6
    println("Ingresa el apotema")
    var apotema = Scanner(System.`in`).nextDouble()
    var area = perimetro * apotema / 2
    println("El perímetro del hexágono es: $perimetro cm y el área es: $area cm2")

}
