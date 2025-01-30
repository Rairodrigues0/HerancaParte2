package imovel

class Velho(
    endereco: String,
    valor: Double,
    adicional: Double,
    val desconto: Double
): Novo(endereco, valor, adicional) {
    override fun acesso(): Double {
        return super.acesso()
    }

    override fun impressao() {
        println("O desconto foi de: $desconto")
    }
}