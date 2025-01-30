package imovel

open class Novo(
    endereco: String,
    valor: Double,
    val adicional: Double
): Imovel(endereco, valor) {
    open  fun acesso(): Double{
        return adicional
    }

    open fun impressao(){
        println("O valor adicional é: $adicional")
    }
}