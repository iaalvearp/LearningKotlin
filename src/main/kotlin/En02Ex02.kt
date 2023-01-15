import java.util.*

/*
Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad de dinero en
pesos.
 */

fun main() {
    var scUserMoney = Scanner(System.`in`)
    var money = scUserMoney.nextInt()

    var dolar = money / 180.85f
    var euro = money / 180.95f

    println("Tus ${money} pesos argentinos equivalen a ${dolar} dolares americanos y a ${euro} euros")
}