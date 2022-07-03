package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Diego"
    var cpf: String = "123.123.123-12"

    inner class Endereço {
        var rua: String = "Rua um"
    }
}

fun main() {
    val diego = Pessoa()

    println(diego.name)
    println(diego.cpf)

    println(diego.Endereço().rua)
}