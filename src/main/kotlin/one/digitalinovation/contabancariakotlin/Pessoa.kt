package one.digitalinovation.contabancariakotlin

class Pessoa {
    var nome: String = "Breno"
    var cpf: String = "123.1263.123-11"
    private set // impede alterarações fora do escopo da classe

    constructor()


    inner class Endereco{
        var rua: String = "Arquimedes"
    }

    fun pessoaInfo() = "$nome e $cpf"
}
fun main(){
    val breno = Pessoa()
    // breno.cpf="123"// impedido pelo private set dentro

    println(breno.pessoaInfo())

    println(breno.Endereco().rua)
}