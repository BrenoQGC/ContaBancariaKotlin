package one.digitalinovation.contabancariakotlin

class Pessoa {
    var nome: String = "Breno"
    var cpf: String = "123.1263.123-11"
}
fun main(){
    val breno = Pessoa()

    println(breno.nome)
    println(breno.cpf)
}