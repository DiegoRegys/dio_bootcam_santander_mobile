package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Diego"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"
/*
    inner class Endereço {
        var rua: String = "Rua um"
    }*/
}

fun main() {
    val diego = Pessoa()

    //diego.cpf = 123

    println(diego.pessoaInfo())
    println(diego.name)
    println(diego.cpf)

    //println(diego.Endereço().rua)
}