import java.util.Scanner

/*
   Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

   Disclaimer: I'm new in this language so I just learn the Scanner mode to interact to the User.
   Perhaps in a few days I find a better way to communicate with the User.
    */
fun main(args: Array<String>) {
    var scUserName = Scanner(System.`in`)
    var userName = scUserName.next()

    println("Hola ${userName}")
}