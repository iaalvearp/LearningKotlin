import java.util.Scanner

/*
Hacer un programa que calcule el salario de un empleado, si se descuenta el 20% de su
salario bruto.
 */

fun main() {
    var scSalary = Scanner(System.`in`)
    var userSalary = scSalary.nextFloat()

    var descount = userSalary * 0.2

    println("Tu sueldo de $${userSalary} USD con el descuento de $${descount} USD quedaria un total de $${userSalary - descount} USD")

}