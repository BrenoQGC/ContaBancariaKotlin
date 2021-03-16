package one.digitalinovation.contabancariakotlin.testes

import one.digitalinovation.contabancariakotlin.Banco

fun main(){
    val digiOnebank =  Banco(nome = "DigiOne", numero = 12)

    println(digiOnebank.info())

    val banco2 = digiOnebank.copy(nome = "Banco2")
    println(banco2.nome)
    println(banco2.numero)
    //Se necessário fazer alterações é possivel fazer uma copia do dataclass
}